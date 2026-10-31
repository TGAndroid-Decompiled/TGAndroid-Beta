package ng;

import ag.t0;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import mg.y1;
import org.telegram.messenger.o5;
import org.telegram.tgnet.TLRPC;
public final class h extends hg.b {
    public TLRPC.User f13780c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f13781f;
    public CharSequence f13782g;
    public CharSequence h;
    public int f13783i;
    public int f13784j;
    public boolean f13785k;
    public int f13786l;
    public t0 f13787m;
    public t0 f13788n;
    public y1 f13789o;
    public y1 f13790p;
    public View f13791q;
    public Drawable f13792r;

    public h(int i10, boolean z10) {
        super(i10, z10);
        this.f13786l = -1;
    }

    public static h b(CharSequence charSequence) {
        h hVar = new h(8, false);
        hVar.f13782g = charSequence;
        return hVar;
    }

    public static h c(TLRPC.User user, boolean z10) {
        h hVar = new h(3, true);
        hVar.f13780c = user;
        hVar.d = null;
        hVar.e = null;
        hVar.f13785k = z10;
        return hVar;
    }

    @Override
    public final boolean a(hg.b bVar) {
        boolean z10;
        boolean z11;
        if (this != bVar) {
            if (h.class == bVar.getClass()) {
                h hVar = (h) bVar;
                if (this.f13785k == hVar.f13785k) {
                    if (this.f7680a == 8) {
                        if (TextUtils.equals(this.h, hVar.h)) {
                            if (this.f13787m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (hVar.f13787m == null) {
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
                int i10 = this.f7680a;
                if (i10 == hVar.f7680a) {
                    if (i10 != -1 || this.f13786l == hVar.f13786l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f13780c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f19942id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f19793id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = o5.n(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = hVar.f13780c;
                            if (user2 != null) {
                                j11 = user2.f19942id;
                            } else {
                                TLRPC.Chat chat2 = hVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f19793id;
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
                        int i11 = this.f7680a;
                        if (i11 != 6 || this.f13781f == hVar.f13781f) {
                            if (i11 != 7 || TextUtils.equals(this.f13782g, hVar.f13782g)) {
                                if (this.f7680a != 8 || TextUtils.equals(this.f13782g, hVar.f13782g)) {
                                    if (this.f7680a != 9 || (TextUtils.equals(this.f13782g, hVar.f13782g) && this.f13783i == hVar.f13783i && this.f13784j == hVar.f13784j)) {
                                        if (this.f7680a != 10 || this.f13791q == hVar.f13791q) {
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
