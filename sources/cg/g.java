package cg;

import android.text.TextUtils;
import android.view.View;
import bg.t2;
import bg.u1;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
public final class g extends wf.a {
    public TLRPC.User f2404c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f2405e;
    public TLRPC.TL_help_country f2406f;
    public CharSequence f2407g;
    public String h;
    public int f2408i;
    public int f2409j;
    public boolean f2410k;
    public int f2411l;
    public u1 f2412m;
    public u1 f2413n;
    public t2 f2414o;
    public t2 f2415p;
    public View f2416q;
    public fq f2417r;

    public g(int i9, boolean z10) {
        super(i9, z10);
        this.f2411l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f2407g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f2404c = user;
        gVar.d = null;
        gVar.f2405e = null;
        gVar.f2410k = z10;
        return gVar;
    }

    @Override
    public final boolean a(wf.a aVar) {
        boolean z10;
        boolean z11;
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f2410k == gVar.f2410k) {
                    if (this.f48814a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if (this.f2412m == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (gVar.f2412m == null) {
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
                int i9 = this.f48814a;
                if (i9 == gVar.f48814a) {
                    if (i9 != -1 || this.f2411l == gVar.f2411l) {
                        if (i9 == 3) {
                            TLRPC.User user = this.f2404c;
                            long j11 = 0;
                            if (user != null) {
                                j10 = user.f22527id;
                            } else {
                                TLRPC.Chat chat = this.f2405e;
                                if (chat != null) {
                                    j10 = -chat.f22380id;
                                } else {
                                    TLRPC.InputPeer inputPeer = this.d;
                                    if (inputPeer != null) {
                                        j10 = DialogObject.getPeerDialogId(inputPeer);
                                    } else {
                                        j10 = 0;
                                    }
                                }
                            }
                            TLRPC.User user2 = gVar.f2404c;
                            if (user2 != null) {
                                j11 = user2.f22527id;
                            } else {
                                TLRPC.Chat chat2 = gVar.f2405e;
                                if (chat2 != null) {
                                    j11 = -chat2.f22380id;
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
                        int i10 = this.f48814a;
                        if (i10 != 6 || this.f2406f == gVar.f2406f) {
                            if (i10 != 7 || TextUtils.equals(this.f2407g, gVar.f2407g)) {
                                if (this.f48814a != 8 || TextUtils.equals(this.f2407g, gVar.f2407g)) {
                                    if (this.f48814a != 9 || (TextUtils.equals(this.f2407g, gVar.f2407g) && this.f2408i == gVar.f2408i && this.f2409j == gVar.f2409j)) {
                                        if (this.f48814a != 10 || this.f2416q == gVar.f2416q) {
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
