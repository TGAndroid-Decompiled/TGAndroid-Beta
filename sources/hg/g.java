package hg;

import android.text.TextUtils;
import android.view.View;
import cg.n;
import gg.i2;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nq;
public final class g extends bg.b {
    public TLRPC.User f7089c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public TLRPC.TL_help_country f7090f;
    public CharSequence f7091g;
    public String h;
    public int f7092i;
    public int f7093j;
    public boolean f7094k;
    public int f7095l;
    public n f7096m;
    public n f7097n;
    public i2 f7098o;
    public i2 f7099p;
    public View f7100q;
    public nq f7101r;

    public g(int i10, boolean z4) {
        super(i10, z4);
        this.f7095l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f7091g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z4) {
        g gVar = new g(3, true);
        gVar.f7089c = user;
        gVar.d = null;
        gVar.e = null;
        gVar.f7094k = z4;
        return gVar;
    }

    @Override
    public final boolean a(bg.b bVar) {
        boolean z4;
        boolean z10;
        if (this != bVar) {
            if (g.class == bVar.getClass()) {
                g gVar = (g) bVar;
                if (this.f7094k == gVar.f7094k) {
                    if (this.f1808a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f7096m == null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (gVar.f7096m == null) {
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
                int i10 = this.f1808a;
                if (i10 == gVar.f1808a) {
                    if (i10 != -1 || this.f7095l == gVar.f7095l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f7089c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f19331id;
                            } else {
                                TLRPC.Chat chat = this.e;
                                if (chat != null) {
                                    j10 = -chat.f19184id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f7089c;
                            if (user2 != null) {
                                j11 = user2.f19331id;
                            } else {
                                TLRPC.Chat chat2 = gVar.e;
                                if (chat2 != null) {
                                    j11 = -chat2.f19184id;
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
                        int i11 = this.f1808a;
                        if (i11 != 6 || this.f7090f == gVar.f7090f) {
                            if (i11 != 7 || TextUtils.equals(this.f7091g, gVar.f7091g)) {
                                if (this.f1808a != 8 || TextUtils.equals(this.f7091g, gVar.f7091g)) {
                                    if (this.f1808a != 9 || (TextUtils.equals(this.f7091g, gVar.f7091g) && this.f7092i == gVar.f7092i && this.f7093j == gVar.f7093j)) {
                                        if (this.f1808a != 10 || this.f7100q == gVar.f7100q) {
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
