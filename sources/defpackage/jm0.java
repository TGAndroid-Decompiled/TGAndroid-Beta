package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jm0 extends ka {
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

    public static jm0 b(int i, TLRPC.Chat chat, boolean z) {
        ?? kaVar = new ka(9, false);
        kaVar.e = chat;
        kaVar.d = null;
        kaVar.g = z;
        kaVar.i = i;
        return kaVar;
    }

    public static jm0 c(CharSequence charSequence, boolean z) {
        ?? kaVar = new ka(7, false);
        kaVar.c = charSequence;
        kaVar.g = z;
        return kaVar;
    }

    public static jm0 d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i, long j, boolean z, boolean z2) {
        ?? kaVar = new ka(17, z);
        kaVar.i = i;
        kaVar.h = j;
        kaVar.m = tL_starsGiveawayOption;
        kaVar.g = z2;
        return kaVar;
    }

    public static jm0 e(int i, int i2, ArrayList arrayList, boolean z) {
        boolean z2;
        if (i2 == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        ?? kaVar = new ka(11, z2);
        kaVar.l = i;
        kaVar.g = z;
        kaVar.f = arrayList;
        return kaVar;
    }

    public static jm0 f(String str) {
        ?? kaVar = new ka(6, false);
        kaVar.c = str;
        return kaVar;
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
    public final boolean a(ka kaVar) {
        jm0 jm0Var;
        int i;
        int i2;
        if (this != kaVar) {
            if (jm0.class == kaVar.getClass() && (i = (jm0Var = (jm0) kaVar).a) == (i2 = this.a)) {
                if (i2 == 0) {
                    if (this.g == jm0Var.g) {
                        return true;
                    }
                    return false;
                } else if (i == 17) {
                    if (this.i == jm0Var.i && this.h == jm0Var.h && this.m == jm0Var.m && this.g == jm0Var.g && this.b == jm0Var.b) {
                        return true;
                    }
                    return false;
                } else if (i2 == 5) {
                    if (this.i == jm0Var.i && g(this.k, jm0Var.k)) {
                        return true;
                    }
                    return false;
                } else if (i2 == 13 && this.i == jm0Var.i && TextUtils.equals(this.c, jm0Var.c)) {
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
            if (obj != null && jm0.class == obj.getClass()) {
                jm0 jm0Var = (jm0) obj;
                int i = this.a;
                if (i == jm0Var.a) {
                    if (i != 0) {
                        if (i == 17) {
                            if (this.i == jm0Var.i && this.m == jm0Var.m) {
                                return true;
                            }
                            return false;
                        } else if (i == 5) {
                            return g(this.k, jm0Var.k);
                        } else {
                            if (i == 13) {
                                return TextUtils.equals(this.c, jm0Var.c);
                            }
                            if (this.e == jm0Var.e && this.f == jm0Var.f && this.d == jm0Var.d && this.m == jm0Var.m && this.g == jm0Var.g && this.i == jm0Var.i && this.j == jm0Var.j && this.h == jm0Var.h && this.l == jm0Var.l && TextUtils.equals(this.c, jm0Var.c)) {
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
