package ng;

import ag.t0;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import mg.y1;
import org.telegram.messenger.o5;
import org.telegram.tgnet.TLRPC;
public final class h extends hg.b {
    public TLRPC.User f13781c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f13782f;
    public CharSequence f13783g;
    public CharSequence h;
    public int f13784i;
    public int f13785j;
    public boolean f13786k;
    public int f13787l;
    public t0 f13788m;
    public t0 f13789n;
    public y1 f13790o;
    public y1 f13791p;
    public View f13792q;
    public Drawable f13793r;

    public h(int i10, boolean z10) {
        super(i10, z10);
        this.f13787l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f13783g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z10) {
        h hVar = new h(3, true);
        hVar.f13781c = user;
        hVar.d = null;
        hVar.e = null;
        hVar.f13786k = z10;
        return hVar;
    }

    @Override
    public final boolean a(hg.b bVar) {
        boolean z10;
        boolean z11;
        if (this != bVar) {
            if (h.class == bVar.getClass()) {
                h hVar = (h) bVar;
                if (this.f13786k == hVar.f13786k) {
                    if (this.f7681a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f13788m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (hVar.f13788m == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10 == z11) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        long j10;
        if (this != obj) {
            if (obj != null && h.class == obj.getClass()) {
                h hVar = (h) obj;
                int i10 = this.f7681a;
                if (i10 == hVar.f7681a) {
                    if (i10 != -1 || this.f13787l == hVar.f13787l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f13781c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f19943id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f19794id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = o5.n(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = hVar.f13781c;
                            if (user2 != null) {
                                j11 = user2.f19943id;
                            } else {
                                TLRPC.Chat chat2 = hVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f19794id;
                                } else {
                                    TLRPC.InputPeer inputPeer2 = hVar.d;
                                    if (inputPeer2 != null) {
                                        j11 = o5.n(inputPeer2);
                                    }
                                }
                            }
                            if (j10 != j11) {
                                return false;
                            }
                        }
                        int i11 = this.f7681a;
                        if (i11 != 6 || this.f13782f == hVar.f13782f) {
                            if (i11 != 7 || TextUtils.equals(this.f13783g, hVar.f13783g)) {
                                if (this.f7681a != 8 || TextUtils.equals(this.f13783g, hVar.f13783g)) {
                                    if (this.f7681a != 9 || (TextUtils.equals(this.f13783g, hVar.f13783g) && this.f13784i == hVar.f13784i && this.f13785j == hVar.f13785j)) {
                                        if (this.f7681a != 10 || this.f13792q == hVar.f13792q) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
