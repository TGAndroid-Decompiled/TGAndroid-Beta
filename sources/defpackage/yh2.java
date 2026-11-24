package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yh2 extends n7c {
    public final d9c e;
    public final long f;
    public final b9c h;
    public String n;
    public zja r;
    public boolean s = false;

    public yh2(d9c d9cVar, long j, b9c b9cVar) {
        this.e = d9cVar;
        this.f = j;
        this.h = b9cVar;
        xh2 xh2Var = new xh2(this, (byte) 0);
        if (d9cVar.b) {
            xh2Var.run();
        } else {
            d9cVar.e.add(xh2Var);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        int i;
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j = this.f;
        if (isEmpty && j != 0) {
            c6c c = c6c.c(1, 2131232059, jb6.M0(2131751172, null));
            c.s = true;
            arrayList.add(c);
            arrayList.add(c6c.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            aq1.o(2131751171, null, arrayList);
        }
        ArrayList arrayList2 = this.e.d;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !sd2.n0(chat)) {
                i2++;
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String I3 = gm.I3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String I32 = gm.I3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !hg9.s(" ", lowerCase, lowerCase2) && !I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                    }
                }
                long j2 = chat.id;
                c6c c6cVar = new c6c(11);
                c6cVar.x = true;
                c6cVar.y = -j2;
                if (j == j2) {
                    z = true;
                } else {
                    z = false;
                }
                c6cVar.L(z);
                arrayList.add(c6cVar);
            }
        }
        if (TextUtils.isEmpty(this.n) && i2 == 0) {
            c6c c2 = c6c.c(2, 2131232095, jb6.M0(2131751169, null));
            c2.r = true;
            arrayList.add(c2);
        }
        arrayList.add(c6c.C(null));
        zja zjaVar = this.r;
        if (zjaVar != null) {
            if (i2 > 5) {
                i = 0;
            } else {
                i = 8;
            }
            zjaVar.setVisibility(i);
        }
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131751168, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        int i = c6cVar.d;
        b9c b9cVar = this.h;
        if (i == 1) {
            b9cVar.a(null);
            finishFragment();
        } else if (i == 2) {
            this.s = true;
            SharedPreferences d1 = oc7.d1();
            boolean z = e21.a;
            presentFragment(new u8(0));
            d1.edit().putBoolean("channel_intro", true).apply();
        } else if (c6cVar.a == 12) {
            finishFragment();
            b9cVar.a(getMessagesController().L0(Long.valueOf(-c6cVar.y)));
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        yja t = this.simpleActionBar.t();
        getResourceProvider();
        zja a = t.a(0, 2131232503);
        a.N();
        a.C0 = new q20(this, (byte) 6);
        this.r = a;
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        this.r.setContentDescription(jb6.M0(2131745570, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
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
            d9c d9cVar = this.e;
            d9cVar.b = false;
            d9cVar.e.add(new xh2(this, (byte) 1));
            this.s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
