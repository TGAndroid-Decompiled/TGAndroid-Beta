package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class md5 extends c79 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public se4 f;
    public String h;
    public int n;
    public final nd5 r;

    public md5(nd5 nd5Var, Context context) {
        this.r = nd5Var;
        this.c = context;
        C(true);
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (d(f89Var.b()) == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        nd5 nd5Var = this.r;
        if (nd5Var.O) {
            boolean isEmpty = TextUtils.isEmpty(str);
            d79 d79Var = nd5Var.d;
            if (!isEmpty) {
                yob.h(aob.d6, nd5Var.getResourceProvider(), d79Var);
            } else {
                d79Var.setBackground(null);
            }
        }
        if (this.n != 0) {
            nd5Var.getConnectionsManager().cancelRequest(this.n, true);
            this.n = 0;
        }
        se4 se4Var = this.f;
        if (se4Var != null) {
            hl.r(se4Var);
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
        z2b z2bVar = nd5Var.b;
        if (isEmpty2) {
            z2bVar.setVisibility(8);
            nd5Var.b.e(false, true);
            return;
        }
        int visibility = z2bVar.getVisibility();
        z2b z2bVar2 = nd5Var.b;
        if (visibility != 0) {
            z2bVar2.setVisibility(0);
            nd5Var.b.e(true, false);
        } else {
            z2bVar2.e(true, true);
        }
        se4 se4Var2 = new se4(this, str, (byte) 28);
        this.f = se4Var2;
        hl.d3(se4Var2, 300L);
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
    public final void t(f89 f89Var, int i) {
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
        q3b q3bVar = (q3b) f89Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i);
        if (i != arrayList.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        q3bVar.d(tL_messages_stickerSet, z2, !z);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        nd5 nd5Var = this.r;
        vnb resourceProvider = nd5Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new ho4(aob.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            q3bVar.b.setText(spannableString);
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
            spannableString2.setSpan(new ho4(aob.q6, resourceProvider), length, str.length() + length, 0);
            q3bVar.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nd5Var.r;
        if (tL_messages_stickerSet2 != null) {
            j = tL_messages_stickerSet2.set.id;
        } else if (nd5Var.c0(nd5Var.w) != null) {
            j = nd5Var.c0(nd5Var.w).id;
        } else {
            j = 0;
        }
        if (tL_messages_stickerSet.set.id != j) {
            z3 = false;
        }
        q3bVar.b(z3, false);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        q3b q3bVar;
        int i2;
        if (i != 0) {
            int i3 = aob.B6;
            nd5 nd5Var = this.r;
            mf5 mf5Var = new mf5(this.c, i3, 21, 0, 0, false, false, nd5Var.getResourceProvider());
            if (nd5Var.O) {
                i2 = 2131752084;
            } else {
                i2 = 2131752083;
            }
            mf5Var.setText(ob6.M0(i2, null));
            q3bVar = mf5Var;
        } else {
            q3b q3bVar2 = new q3b(this.c, 3);
            yob.h(aob.d6, null, q3bVar2);
            q3bVar = q3bVar2;
        }
        q3bVar.setLayoutParams(new r79(-1, -2));
        return new f89(q3bVar);
    }
}
