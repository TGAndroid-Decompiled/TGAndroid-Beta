package dg;

import ag.q0;
import android.text.TextUtils;
import android.view.View;
import cg.l2;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;

public final class g extends xf.a {

    public TLRPC.User f4948c;
    public TLRPC.InputPeer d;

    public TLRPC.Chat f4949e;

    public TLRPC.TL_help_country f4950f;

    public CharSequence f4951g;
    public String h;

    public int f4952i;

    public int f4953j;

    public boolean f4954k;

    public int f4955l;

    public q0 f4956m;

    public q0 f4957n;

    public l2 f4958o;

    public l2 f4959p;

    public View f4960q;

    public dq f4961r;

    public g(int i10, boolean z10) {
        super(i10, z10);
        this.f4955l = -1;
    }

    public static g b(CharSequence charSequence) {
        g gVar = new g(8, false);
        gVar.f4951g = charSequence;
        return gVar;
    }

    public static g c(TLRPC.User user, boolean z10) {
        g gVar = new g(3, true);
        gVar.f4948c = user;
        gVar.d = null;
        gVar.f4949e = null;
        gVar.f4954k = z10;
        return gVar;
    }

    @Override
    public final boolean a(xf.a aVar) {
        if (this != aVar) {
            if (g.class == aVar.getClass()) {
                g gVar = (g) aVar;
                if (this.f4954k == gVar.f4954k) {
                    if (this.f49413a == 8) {
                        if (TextUtils.equals(this.h, gVar.h)) {
                            if ((this.f4956m == null) == (gVar.f4956m == null)) {
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
        long peerDialogId;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        int i10 = this.f49413a;
        if (i10 != gVar.f49413a) {
            return false;
        }
        if (i10 == -1 && this.f4955l != gVar.f4955l) {
            return false;
        }
        if (i10 == 3) {
            TLRPC.User user = this.f4948c;
            long peerDialogId2 = 0;
            if (user != null) {
                peerDialogId = user.f22527id;
            } else {
                TLRPC.Chat chat = this.f4949e;
                if (chat != null) {
                    peerDialogId = -chat.f22380id;
                } else {
                    TLRPC.InputPeer inputPeer = this.d;
                    peerDialogId = inputPeer != null ? DialogObject.getPeerDialogId(inputPeer) : 0L;
                }
            }
            TLRPC.User user2 = gVar.f4948c;
            if (user2 != null) {
                peerDialogId2 = user2.f22527id;
            } else {
                TLRPC.Chat chat2 = gVar.f4949e;
                if (chat2 != null) {
                    peerDialogId2 = -chat2.f22380id;
                } else {
                    TLRPC.InputPeer inputPeer2 = gVar.d;
                    if (inputPeer2 != null) {
                        peerDialogId2 = DialogObject.getPeerDialogId(inputPeer2);
                    }
                }
            }
            if (peerDialogId != peerDialogId2) {
                return false;
            }
        }
        int i11 = this.f49413a;
        if (i11 == 6 && this.f4950f != gVar.f4950f) {
            return false;
        }
        if (i11 == 7 && !TextUtils.equals(this.f4951g, gVar.f4951g)) {
            return false;
        }
        if (this.f49413a == 8 && !TextUtils.equals(this.f4951g, gVar.f4951g)) {
            return false;
        }
        if (this.f49413a != 9 || (TextUtils.equals(this.f4951g, gVar.f4951g) && this.f4952i == gVar.f4952i && this.f4953j == gVar.f4953j)) {
            return this.f49413a != 10 || this.f4960q == gVar.f4960q;
        }
        return false;
    }
}
