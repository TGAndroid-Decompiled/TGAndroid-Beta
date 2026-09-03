package hg;

import android.text.TextUtils;
import android.view.View;
import cg.n;
import gg.i2;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mq;
public final class g extends bg.b {
    public TLRPC.User f7072c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f7073f;
    public CharSequence f7074g;
    public String h;
    public int f7075i;
    public int f7076j;
    public boolean f7077k;
    public int f7078l;
    public n f7079m;
    public n f7080n;
    public i2 f7081o;
    public i2 f7082p;
    public View f7083q;
    public mq f7084r;

    public g(int i10, boolean z4) {
        super(i10, z4);
        this.f7078l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f7074g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z4) {
        g gVar = new g(3, true);
        gVar.f7072c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f7077k = z4;
        return gVar;
    }

    @Override
    public final boolean a(bg.b bVar) {
        boolean z4;
        boolean z10;
        if (this != bVar) {
            if (g.class == bVar.getClass()) {
                g gVar = (g) bVar;
                if (this.f7077k == gVar.f7077k) {
                    if (this.f1830a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f7079m == null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (gVar.f7079m == null) {
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
                int i10 = this.f1830a;
                if (i10 == gVar.f1830a) {
                    if (i10 != -1 || this.f7078l == gVar.f7078l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f7072c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f19306id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f19159id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f7072c;
                            if (user2 != null) {
                                j11 = user2.f19306id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f19159id;
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
                        int i11 = this.f1830a;
                        if (i11 != 6 || this.f7073f == gVar.f7073f) {
                            if (i11 != 7 || TextUtils.equals(this.f7074g, gVar.f7074g)) {
                                if (this.f1830a != 8 || TextUtils.equals(this.f7074g, gVar.f7074g)) {
                                    if (this.f1830a != 9 || (TextUtils.equals(this.f7074g, gVar.f7074g) && this.f7075i == gVar.f7075i && this.f7076j == gVar.f7076j)) {
                                        if (this.f1830a != 10 || this.f7083q == gVar.f7083q) {
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
