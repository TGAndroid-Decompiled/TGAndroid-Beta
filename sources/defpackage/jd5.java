package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class jd5 extends q59 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public fd5 f;
    public String h;
    public int n;
    public final kd5 r;

    public jd5(kd5 kd5Var, Context context) {
        this.r = kd5Var;
        this.c = context;
        C(true);
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (d(u69Var.b()) == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        kd5 kd5Var = this.r;
        if (kd5Var.O) {
            boolean isEmpty = TextUtils.isEmpty(str);
            r59 r59Var = kd5Var.d;
            if (!isEmpty) {
                anb.h(cmb.c6, kd5Var.getResourceProvider(), r59Var);
            } else {
                r59Var.setBackground(null);
            }
        }
        if (this.n != 0) {
            kd5Var.getConnectionsManager().cancelRequest(this.n, true);
            this.n = 0;
        }
        fd5 fd5Var = this.f;
        if (fd5Var != null) {
            gm.r(fd5Var);
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
        a1b a1bVar = kd5Var.b;
        if (isEmpty2) {
            a1bVar.setVisibility(8);
            kd5Var.b.e(false, true);
            return;
        }
        int visibility = a1bVar.getVisibility();
        a1b a1bVar2 = kd5Var.b;
        if (visibility != 0) {
            a1bVar2.setVisibility(0);
            kd5Var.b.e(true, false);
        } else {
            a1bVar2.e(true, true);
        }
        fd5 fd5Var2 = new fd5(this, str, (byte) 2);
        this.f = fd5Var2;
        gm.d3(fd5Var2, 300L);
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
    public final void t(u69 u69Var, int i) {
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
        s1b s1bVar = (s1b) u69Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i);
        if (i != arrayList.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        s1bVar.d(tL_messages_stickerSet, z2, !z);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        kd5 kd5Var = this.r;
        ylb resourceProvider = kd5Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new do4(cmb.p6, resourceProvider), indexOf, str.length() + indexOf, 0);
            s1bVar.b.setText(spannableString);
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
            spannableString2.setSpan(new do4(cmb.p6, resourceProvider), length, str.length() + length, 0);
            s1bVar.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = kd5Var.r;
        if (tL_messages_stickerSet2 != null) {
            j = tL_messages_stickerSet2.set.id;
        } else if (kd5Var.d0(kd5Var.w) != null) {
            j = kd5Var.d0(kd5Var.w).id;
        } else {
            j = 0;
        }
        if (tL_messages_stickerSet.set.id != j) {
            z3 = false;
        }
        s1bVar.b(z3, false);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        s1b s1bVar;
        int i2;
        if (i != 0) {
            int i3 = cmb.A6;
            kd5 kd5Var = this.r;
            jf5 jf5Var = new jf5(this.c, i3, 21, 0, 0, false, false, kd5Var.getResourceProvider());
            if (kd5Var.O) {
                i2 = 2131752056;
            } else {
                i2 = 2131752055;
            }
            jf5Var.setText(jb6.M0(i2, null));
            s1bVar = jf5Var;
        } else {
            s1b s1bVar2 = new s1b(this.c, 3);
            anb.h(cmb.c6, null, s1bVar2);
            s1bVar = s1bVar2;
        }
        s1bVar.setLayoutParams(new g69(-1, -2));
        return new u69(s1bVar);
    }
}
