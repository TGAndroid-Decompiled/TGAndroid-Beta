package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class dd5 extends e implements fn7 {
    public cd5 a;
    public d79 b;
    public b34 c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;

    public final void Y(boolean z) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new q81((byte) 5, this, z)), this.classGuid);
        cd5 cd5Var = this.a;
        if (cd5Var != null) {
            cd5Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131748903, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 26));
        this.a = new cd5(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.c = b34Var;
        b34Var.b();
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new x46(1, false));
        this.b.setEmptyView(this.c);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, tre.e(-1, -1, 51));
        frameLayout.addView(this.c, tre.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new zg4(this, (byte) 3));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        long j = this.d;
        if (i == jn7.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).id == j && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().r.f(j);
                this.f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Y(false);
                    return;
                }
                this.e = false;
                cd5 cd5Var = this.a;
                if (cd5Var != null) {
                    cd5Var.f();
                }
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        jn7.f(this.currentAccount).b(this, jn7.T);
        getMessagesController().e3(this.classGuid, this.d, true);
        this.e = true;
        this.h = true;
        this.n = 2;
        this.r = 3;
        this.s = 4;
        this.x = 6;
        this.w = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        cd5 cd5Var = this.a;
        if (cd5Var != null) {
            cd5Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            b34 b34Var = this.c;
            if (b34Var != null) {
                b34Var.setProgressBarColor(aob.w0(null, aob.h6, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
