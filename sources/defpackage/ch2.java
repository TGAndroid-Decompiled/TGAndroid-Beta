package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ch2 extends n9c {
    public final cbc e;
    public final long f;
    public final abc h;
    public String n;
    public sla r;
    public boolean s = false;

    public ch2(cbc cbcVar, long j, abc abcVar) {
        this.e = cbcVar;
        this.f = j;
        this.h = abcVar;
        bh2 bh2Var = new bh2(this, (byte) 0);
        if (cbcVar.b) {
            bh2Var.run();
        } else {
            cbcVar.e.add(bh2Var);
        }
    }

    @Override
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        int i;
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j = this.f;
        if (isEmpty && j != 0) {
            b8c c = b8c.c(1, 2131232058, ob6.M0(2131751200, null));
            c.s = true;
            arrayList.add(c);
            arrayList.add(b8c.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            bp1.o(2131751199, null, arrayList);
        }
        ArrayList arrayList2 = this.e.d;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !xc2.n0(chat)) {
                i2++;
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String I3 = hl.I3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String I32 = hl.I3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !uh9.t(" ", lowerCase, lowerCase2) && !I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                    }
                }
                long j2 = chat.id;
                b8c b8cVar = new b8c(11);
                b8cVar.x = true;
                b8cVar.y = -j2;
                if (j == j2) {
                    z = true;
                } else {
                    z = false;
                }
                b8cVar.L(z);
                arrayList.add(b8cVar);
            }
        }
        if (TextUtils.isEmpty(this.n) && i2 == 0) {
            b8c c2 = b8c.c(2, 2131232094, ob6.M0(2131751197, null));
            c2.r = true;
            arrayList.add(c2);
        }
        arrayList.add(b8c.C(null));
        sla slaVar = this.r;
        if (slaVar != null) {
            if (i2 > 5) {
                i = 0;
            } else {
                i = 8;
            }
            slaVar.setVisibility(i);
        }
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131751196, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        int i = b8cVar.d;
        abc abcVar = this.h;
        if (i == 1) {
            abcVar.a(null);
            finishFragment();
        } else if (i == 2) {
            this.s = true;
            SharedPreferences e1 = uc7.e1();
            boolean z = f11.a;
            presentFragment(new v8(0));
            e1.edit().putBoolean("channel_intro", true).apply();
        } else if (b8cVar.a == 12) {
            finishFragment();
            abcVar.a(getMessagesController().M0(Long.valueOf(-b8cVar.y)));
        }
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        rla v = this.simpleActionBar.v();
        getResourceProvider();
        sla a = v.a(0, 2131232502);
        a.N();
        a.C0 = new r10(this, (byte) 6);
        this.r = a;
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        this.r.setContentDescription(ob6.M0(2131745564, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.s) {
            cbc cbcVar = this.e;
            cbcVar.b = false;
            cbcVar.e.add(new bh2(this, (byte) 1));
            this.s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
