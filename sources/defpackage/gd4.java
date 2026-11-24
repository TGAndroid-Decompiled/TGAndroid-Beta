package defpackage;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;
public final class gd4 extends ja {
    public View.OnClickListener c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public long h;
    public String i;
    public short j;
    public int k;
    public boolean l;
    public TL_chatlists.TL_exportedChatlistInvite m;

    public static gd4 b(int i, String str, boolean z) {
        ?? jaVar = new ja(4, false);
        jaVar.k = i;
        jaVar.d = str;
        jaVar.l = z;
        return jaVar;
    }

    public static gd4 c(int i, String str, String str2, boolean z) {
        ?? jaVar = new ja(1, false);
        jaVar.g = z;
        jaVar.d = str;
        jaVar.i = str2;
        jaVar.j = i;
        return jaVar;
    }

    public static gd4 d(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            i = 3;
        } else {
            i = 6;
        }
        ?? jaVar = new ja(i, false);
        jaVar.d = str;
        return jaVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj != null && gd4.class == obj.getClass()) {
                gd4 gd4Var = (gd4) obj;
                int i = this.a;
                if (i == gd4Var.a) {
                    if (i == 11) {
                        if (!TextUtils.equals(this.d, gd4Var.d) || !TextUtils.equals(this.e, gd4Var.e)) {
                            return false;
                        }
                    } else if ((i != 0 && i != 1 && i != 3 && i != 4) || TextUtils.equals(this.d, gd4Var.d)) {
                        int i2 = this.a;
                        if (i2 == 0) {
                            if (this.f != gd4Var.f) {
                                return false;
                            }
                        } else if (i2 == 1) {
                            if (this.h != gd4Var.h || !TextUtils.equals(this.i, gd4Var.i) || this.j != gd4Var.j) {
                                return false;
                            }
                        } else if (i2 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = gd4Var.m)) {
                            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                                boolean z = tL_exportedChatlistInvite3.revoked;
                                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = gd4Var.m;
                                if (z != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != gd4Var.m.peers.size()) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
