package ig;

import android.text.TextUtils;
import android.view.View;
import dg.n;
import hg.i2;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
public final class g extends cg.b {
    public TLRPC.User f8085c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f8086e;
    public TLRPC.TL_help_country f8087f;
    public CharSequence f8088g;
    public String h;
    public int f8089i;
    public int f8090j;
    public boolean f8091k;
    public int f8092l;
    public n f8093m;
    public n f8094n;
    public i2 f8095o;
    public i2 f8096p;
    public View f8097q;
    public pq f8098r;

    public g(int i10, boolean z4) {
        super(i10, z4);
        this.f8092l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f8088g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z4) {
        g gVar = new g(3, true);
        gVar.f8085c = user;
        gVar.d = null;
        gVar.f8086e = null;
        gVar.f8091k = z4;
        return gVar;
    }

    @Override
    public final boolean a(cg.b bVar) {
        boolean z4;
        boolean z10;
        if (this != bVar) {
            if (g.class == bVar.getClass()) {
                g gVar = (g) bVar;
                if (this.f8091k == gVar.f8091k) {
                    if (this.f2505a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f8093m == null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (gVar.f8093m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z4 == z10) {
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
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                int i10 = this.f2505a;
                if (i10 == gVar.f2505a) {
                    if (i10 != -1 || this.f8092l == gVar.f8092l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f8085c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f20990id;
                            } else {
                                TLRPC.Chat chat = this.f8086e;
                                if (chat != null) {
                                    j10 = -chat.f20843id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f8085c;
                            if (user2 != null) {
                                j11 = user2.f20990id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f8086e;
                                if (chat2 != null) {
                                    j11 = -chat2.f20843id;
                                } else {
                                    TLRPC.InputPeer inputPeer2 = gVar.d;
                                    if (inputPeer2 != null) {
                                        j11 = DialogObject.getPeerDialogId(inputPeer2);
                                    }
                                }
                            }
                            if (j10 != j11) {
                                return false;
                            }
                        }
                        int i11 = this.f2505a;
                        if (i11 != 6 || this.f8087f == gVar.f8087f) {
                            if (i11 != 7 || TextUtils.equals(this.f8088g, gVar.f8088g)) {
                                if (this.f2505a != 8 || TextUtils.equals(this.f8088g, gVar.f8088g)) {
                                    if (this.f2505a != 9 || (TextUtils.equals(this.f8088g, gVar.f8088g) && this.f8089i == gVar.f8089i && this.f8090j == gVar.f8090j)) {
                                        if (this.f2505a != 10 || this.f8097q == gVar.f8097q) {
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
