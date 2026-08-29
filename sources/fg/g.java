package fg;

import ag.n;
import android.text.TextUtils;
import android.view.View;
import eg.j2;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jq;
public final class g extends zf.a {
    public TLRPC.User f6743c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f6744e;
    public TLRPC.TL_help_country f6745f;
    public CharSequence f6746g;
    public String h;
    public int f6747i;
    public int f6748j;
    public boolean f6749k;
    public int f6750l;
    public n f6751m;
    public n f6752n;
    public j2 f6753o;
    public j2 f6754p;
    public View f6755q;
    public jq f6756r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f6750l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f6746g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f6743c = user;
        gVar.d = null;
        gVar.f6744e = null;
        gVar.f6749k = z10;
        return gVar;
    }

    @Override
    public final boolean a(zf.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f6749k == gVar.f6749k) {
                    if (this.f50845a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f6751m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f6751m == null) {
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
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                int i10 = this.f50845a;
                if (i10 == gVar.f50845a) {
                    if (i10 != -1 || this.f6750l == gVar.f6750l) {
                        if (i10 == 3) {
                            TLRPC.User user = this.f6743c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f22539id;
                            } else {
                                TLRPC.Chat chat = this.f6744e;
                                if (chat != null) {
                                    j10 = -chat.f22392id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f6743c;
                            if (user2 != null) {
                                j11 = user2.f22539id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f6744e;
                                if (chat2 != null) {
                                    j11 = -chat2.f22392id;
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
                        int i11 = this.f50845a;
                        if (i11 != 6 || this.f6745f == gVar.f6745f) {
                            if (i11 != 7 || TextUtils.equals(this.f6746g, gVar.f6746g)) {
                                if (this.f50845a != 8 || TextUtils.equals(this.f6746g, gVar.f6746g)) {
                                    if (this.f50845a != 9 || (TextUtils.equals(this.f6746g, gVar.f6746g) && this.f6747i == gVar.f6747i && this.f6748j == gVar.f6748j)) {
                                        if (this.f50845a != 10 || this.f6755q == gVar.f6755q) {
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
