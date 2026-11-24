package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class lb5 extends n39 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public hb5 f;
    public String h;
    public int n;
    public final mb5 r;

    public lb5(mb5 mb5Var, Context context) {
        this.r = mb5Var;
        this.c = context;
        C(true);
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (d(s49Var.b()) == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        mb5 mb5Var = this.r;
        if (mb5Var.O) {
            boolean isEmpty = TextUtils.isEmpty(str);
            o39 o39Var = mb5Var.d;
            if (!isEmpty) {
                zkb.h(bkb.c6, mb5Var.getResourceProvider(), o39Var);
            } else {
                o39Var.setBackground(null);
            }
        }
        if (this.n != 0) {
            mb5Var.getConnectionsManager().cancelRequest(this.n, true);
            this.n = 0;
        }
        hb5 hb5Var = this.f;
        if (hb5Var != null) {
            gl.r(hb5Var);
            this.f = null;
        }
        this.h = null;
        int b = b();
        if (b > 0) {
            this.d.clear();
            this.e.clear();
            q(0, b);
        }
        boolean isEmpty2 = TextUtils.isEmpty(str);
        zya zyaVar = mb5Var.b;
        if (isEmpty2) {
            zyaVar.setVisibility(8);
            mb5Var.b.e(false, true);
            return;
        }
        int visibility = zyaVar.getVisibility();
        zya zyaVar2 = mb5Var.b;
        if (visibility != 0) {
            zyaVar2.setVisibility(0);
            mb5Var.b.e(true, false);
        } else {
            zyaVar2.e(true, true);
        }
        hb5 hb5Var2 = new hb5(this, str, (byte) 1);
        this.f = hb5Var2;
        gl.d3(hb5Var2, 300L);
    }

    @Override
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty());
    }

    @Override
    public final long c(int i) {
        ArrayList arrayList;
        if (d(i) == 0) {
            if (i > this.d.size()) {
                arrayList = this.e;
            } else {
                arrayList = this.d;
            }
            if (i > this.d.size()) {
                i = (i - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).set.id;
        }
        return -1L;
    }

    @Override
    public final int d(int i) {
        if (this.d.size() == i) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        ArrayList arrayList;
        boolean z2;
        String str;
        long j;
        String str2;
        if (d(i) != 0) {
            return;
        }
        boolean z3 = true;
        if (i > this.d.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList = this.e;
            i = (i - this.d.size()) - 1;
        } else {
            arrayList = this.d;
        }
        rza rzaVar = (rza) s49Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i);
        if (i != arrayList.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        rzaVar.d(tL_messages_stickerSet, z2, !z);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        mb5 mb5Var = this.r;
        wjb resourceProvider = mb5Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new cm4(bkb.p6, resourceProvider), indexOf, str.length() + indexOf, 0);
            rzaVar.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            SpannableString spannableString2 = new SpannableString(str2 + stickerSet.short_name);
            spannableString2.setSpan(new cm4(bkb.p6, resourceProvider), length, str.length() + length, 0);
            rzaVar.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = mb5Var.r;
        if (tL_messages_stickerSet2 != null) {
            j = tL_messages_stickerSet2.set.id;
        } else if (mb5Var.c0(mb5Var.w) != null) {
            j = mb5Var.c0(mb5Var.w).id;
        } else {
            j = 0;
        }
        if (tL_messages_stickerSet.set.id != j) {
            z3 = false;
        }
        rzaVar.b(z3, false);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        rza rzaVar;
        int i2;
        if (i != 0) {
            int i3 = bkb.A6;
            mb5 mb5Var = this.r;
            ld5 ld5Var = new ld5(this.c, i3, 21, 0, 0, false, false, mb5Var.getResourceProvider());
            if (mb5Var.O) {
                i2 = 2131752107;
            } else {
                i2 = 2131752106;
            }
            ld5Var.setText(k96.M0(i2, null));
            rzaVar = ld5Var;
        } else {
            rza rzaVar2 = new rza(this.c, 3);
            zkb.h(bkb.c6, null, rzaVar2);
            rzaVar = rzaVar2;
        }
        rzaVar.setLayoutParams(new e49(-1, -2));
        return new s49(rzaVar);
    }
}
