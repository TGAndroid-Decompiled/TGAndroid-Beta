package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;
public final class qtc extends q59 {
    public qhc E;
    public final WallpapersListActivity F;
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f = true;
    public String h;
    public String n;
    public String r;
    public int s;
    public int w;
    public boolean x;
    public String y;

    public qtc(WallpapersListActivity wallpapersListActivity, Context context) {
        this.F = wallpapersListActivity;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z) {
        int i;
        if (str != null && this.n != null) {
            str = kt6.p(this.n, " ", str, new StringBuilder("#color"));
        }
        qhc qhcVar = this.E;
        if (qhcVar != null) {
            gm.r(qhcVar);
            this.E = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f = true;
            this.h = null;
            if (this.s != 0) {
                i = ((d) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i).cancelRequest(this.s, true);
                this.s = 0;
            }
            wallpapersListActivity.L.c();
        } else {
            wallpapersListActivity.L.b();
            if (z) {
                arrayList.clear();
                hashMap.clear();
                this.f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                qhc qhcVar2 = new qhc(this, str, (byte) 29);
                this.E = qhcVar2;
                gm.d3(qhcVar2, 500L);
            }
        }
        f();
    }

    public final void F(String str, String str2, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.s;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (i10 != 0) {
            i9 = ((d) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i9).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.y = str;
        i = ((d) wallpapersListActivity).currentAccount;
        oc7 r1 = oc7.r1(i);
        i2 = ((d) wallpapersListActivity).currentAccount;
        TLObject b2 = r1.b2(oc7.r1(i2).p3);
        if (!(b2 instanceof TLRPC.User)) {
            if (z && !this.x) {
                this.x = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i7 = ((d) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = oc7.r1(i7).p3;
                i8 = ((d) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i8).sendRequest(tL_contacts_resolveUsername, new go9(this, (byte) 26));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = b10.h("#wallpaper ", str);
        i3 = ((d) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = oc7.r1(i3).p1((TLRPC.User) b2);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i11 = this.w + 1;
        this.w = i11;
        i4 = ((d) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i4).sendRequest(tL_messages_getInlineBotResults, new w22(this, i11, (byte) 10));
        i5 = ((d) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
        int i12 = this.s;
        i6 = ((d) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i12, i6);
    }

    @Override
    public final int b() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.F.O);
    }

    @Override
    public final int d(int i) {
        if (TextUtils.isEmpty(this.h)) {
            if (i == 0) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        Object obj;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            if (i2 == 2) {
                ((l55) view).setText(jb6.M0(2131745549, null));
                return;
            }
            return;
        }
        ssc sscVar = (ssc) view;
        WallpapersListActivity wallpapersListActivity = this.F;
        int i3 = i * wallpapersListActivity.O;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.O);
        byte b = wallpapersListActivity.O;
        boolean z2 = true;
        if (i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i3 / b != ceil - 1) {
            z2 = false;
        }
        sscVar.d(b, z, z2);
        for (int i4 = 0; i4 < wallpapersListActivity.O; i4++) {
            int i5 = i3 + i4;
            if (i5 < arrayList.size()) {
                obj = arrayList.get(i5);
            } else {
                obj = null;
            }
            sscVar.e(obj, wallpapersListActivity.r ? 1 : 0, i4, "");
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout g32Var;
        Context context = this.c;
        if (i != 0) {
            g32Var = null;
            if (i != 1) {
                if (i == 2) {
                    g32Var = new l55(context, null);
                }
            } else {
                ?? smbVar = new smb(context, null, (byte) 14);
                smbVar.setItemAnimator(null);
                smbVar.setLayoutAnimation(null);
                zs zsVar = new zs((byte) 20);
                smbVar.setPadding(gm.L(7.0f), 0, gm.L(7.0f), 0);
                smbVar.setClipToPadding(false);
                zsVar.i1(0);
                smbVar.setLayoutManager(zsVar);
                smbVar.setAdapter(new ny0(this, (byte) 12));
                smbVar.setOnItemClickListener(new ftc(this, (byte) 1));
                g32Var = smbVar;
            }
        } else {
            g32Var = new g32(this, context, (byte) 2);
            g32Var.setTag(-33024);
        }
        if (i == 1) {
            g32Var.setLayoutParams(new g69(-1, gm.L(60.0f)));
        } else {
            g32Var.setLayoutParams(new g69(-1, -2));
        }
        return new u69(g32Var);
    }
}
