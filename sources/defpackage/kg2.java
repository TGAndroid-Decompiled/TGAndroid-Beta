package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kg2 extends n5c {
    public final c7c e;
    public final long f;
    public final a7c h;
    public String n;
    public xha r;
    public boolean s = false;

    public kg2(c7c c7cVar, long j, a7c a7cVar) {
        this.e = c7cVar;
        this.f = j;
        this.h = a7cVar;
        jg2 jg2Var = new jg2(this, (byte) 0);
        if (c7cVar.b) {
            jg2Var.run();
        } else {
            c7cVar.e.add(jg2Var);
        }
    }

    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        int i;
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j = this.f;
        if (isEmpty && j != 0) {
            c4c c = c4c.c(1, 2131232058, k96.M0(2131751223, null));
            c.s = true;
            arrayList.add(c);
            arrayList.add(c4c.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            oo1.o(2131751222, null, arrayList);
        }
        ArrayList arrayList2 = this.e.d;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !hc2.n0(chat)) {
                i2++;
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String I3 = gl.I3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String I32 = gl.I3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !de9.t(" ", lowerCase, lowerCase2) && !I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                    }
                }
                long j2 = chat.id;
                c4c c4cVar = new c4c(11);
                c4cVar.x = true;
                c4cVar.y = -j2;
                if (j == j2) {
                    z = true;
                } else {
                    z = false;
                }
                c4cVar.L(z);
                arrayList.add(c4cVar);
            }
        }
        if (TextUtils.isEmpty(this.n) && i2 == 0) {
            c4c c2 = c4c.c(2, 2131232094, k96.M0(2131751220, null));
            c2.r = true;
            arrayList.add(c2);
        }
        arrayList.add(c4c.C(null));
        xha xhaVar = this.r;
        if (xhaVar != null) {
            if (i2 > 5) {
                i = 0;
            } else {
                i = 8;
            }
            xhaVar.setVisibility(i);
        }
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131751219, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        int i = c4cVar.d;
        a7c a7cVar = this.h;
        if (i == 1) {
            a7cVar.a(null);
            finishFragment();
        } else if (i == 2) {
            this.s = true;
            SharedPreferences c1 = na7.c1();
            boolean z = w01.a;
            presentFragment(new u8(0));
            c1.edit().putBoolean("channel_intro", true).apply();
        } else if (c4cVar.a == 12) {
            finishFragment();
            a7cVar.a(getMessagesController().K0(Long.valueOf(-c4cVar.y)));
        }
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        wha t = this.simpleActionBar.t();
        getResourceProvider();
        xha a = t.a(0, 2131232491);
        a.N();
        a.C0 = new q10(this, (byte) 6);
        this.r = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.r.setContentDescription(k96.M0(2131745644, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
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
            c7c c7cVar = this.e;
            c7cVar.b = false;
            c7cVar.e.add(new jg2(this, (byte) 1));
            this.s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
