package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jn0 extends ja {
    public CharSequence c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f;
    public boolean g;
    public long h;
    public int i;
    public int j;
    public List k;
    public byte l;
    public TLObject m;

    public static jn0 b(int i, TLRPC.Chat chat, boolean z) {
        ?? jaVar = new ja(9, false);
        jaVar.e = chat;
        jaVar.d = null;
        jaVar.g = z;
        jaVar.i = i;
        return jaVar;
    }

    public static jn0 c(CharSequence charSequence, boolean z) {
        ?? jaVar = new ja(7, false);
        jaVar.c = charSequence;
        jaVar.g = z;
        return jaVar;
    }

    public static jn0 d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i, long j, boolean z, boolean z2) {
        ?? jaVar = new ja(17, z);
        jaVar.i = i;
        jaVar.h = j;
        jaVar.m = tL_starsGiveawayOption;
        jaVar.g = z2;
        return jaVar;
    }

    public static jn0 e(int i, int i2, ArrayList arrayList, boolean z) {
        boolean z2;
        if (i2 == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        ?? jaVar = new ja(11, z2);
        jaVar.l = i;
        jaVar.g = z;
        jaVar.f = arrayList;
        return jaVar;
    }

    public static jn0 f(String str) {
        ?? jaVar = new ja(6, false);
        jaVar.c = str;
        return jaVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null) {
            if (list2 == null) {
                return true;
            }
        } else if (list2 == null || list.size() != list2.size()) {
            return false;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (((Integer) list.get(i)).intValue() != ((Integer) list2.get(i)).intValue()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean a(ja jaVar) {
        jn0 jn0Var;
        int i;
        int i2;
        if (this != jaVar) {
            if (jn0.class == jaVar.getClass() && (i = (jn0Var = (jn0) jaVar).a) == (i2 = this.a)) {
                if (i2 == 0) {
                    if (this.g == jn0Var.g) {
                        return true;
                    }
                    return false;
                } else if (i == 17) {
                    if (this.i == jn0Var.i && this.h == jn0Var.h && this.m == jn0Var.m && this.g == jn0Var.g && this.b == jn0Var.b) {
                        return true;
                    }
                    return false;
                } else if (i2 == 5) {
                    if (this.i == jn0Var.i && g(this.k, jn0Var.k)) {
                        return true;
                    }
                    return false;
                } else if (i2 == 13 && this.i == jn0Var.i && TextUtils.equals(this.c, jn0Var.c)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jn0.class == obj.getClass()) {
                jn0 jn0Var = (jn0) obj;
                int i = this.a;
                if (i == jn0Var.a) {
                    if (i != 0) {
                        if (i == 17) {
                            if (this.i == jn0Var.i && this.m == jn0Var.m) {
                                return true;
                            }
                            return false;
                        } else if (i == 5) {
                            return g(this.k, jn0Var.k);
                        } else {
                            if (i == 13) {
                                return TextUtils.equals(this.c, jn0Var.c);
                            }
                            if (this.e == jn0Var.e && this.f == jn0Var.f && this.d == jn0Var.d && this.m == jn0Var.m && this.g == jn0Var.g && this.i == jn0Var.i && this.j == jn0Var.j && this.h == jn0Var.h && this.l == jn0Var.l && TextUtils.equals(this.c, jn0Var.c)) {
                                return true;
                            }
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
