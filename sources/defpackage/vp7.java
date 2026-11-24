package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class vp7 implements Runnable {
    public final ylb E;
    public final boolean F;
    public final String G;
    public final qw0 H;
    public final b61 a;
    public final b61 b;
    public final TLRPC.TL_urlAuthResultRequest c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth e;
    public final String[] f;
    public final bjb h;
    public final boolean[] n;
    public final boolean[] r;
    public final int[] s;
    public final boolean[] w;
    public final my0 x;
    public final String y;

    public vp7(b61 b61Var, b61 b61Var2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, bjb bjbVar, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, my0 my0Var, String str, ylb ylbVar, boolean z, String str2, qw0 qw0Var) {
        this.a = b61Var;
        this.b = b61Var2;
        this.c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f = strArr;
        this.h = bjbVar;
        this.n = zArr;
        this.r = zArr2;
        this.s = iArr;
        this.w = zArr3;
        this.x = my0Var;
        this.y = str;
        this.E = ylbVar;
        this.F = z;
        this.G = str2;
        this.H = qw0Var;
    }

    @Override
    public final void run() {
        final b61 b61Var = this.a;
        if (!b61Var.R && !this.b.R) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.c;
            boolean z = tL_urlAuthResultRequest.request_wallet;
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
            if (!z || inputtonconnectoauthsessionArr[0] != null) {
                boolean z2 = true;
                b61Var.setLoading(true);
                final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.e;
                if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 2)) {
                    tL_messages_acceptUrlAuth.flags |= 2;
                    tL_messages_acceptUrlAuth.peer = tL_messages_requestUrlAuth.peer;
                    tL_messages_acceptUrlAuth.msg_id = tL_messages_requestUrlAuth.msg_id;
                    tL_messages_acceptUrlAuth.button_id = tL_messages_requestUrlAuth.button_id;
                }
                if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 4)) {
                    tL_messages_acceptUrlAuth.flags |= 4;
                    tL_messages_acceptUrlAuth.url = tL_messages_requestUrlAuth.url;
                }
                String str = this.f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                bjb bjbVar = this.h;
                if (bjbVar == null || !bjbVar.e.h) {
                    z2 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z2;
                tL_messages_acceptUrlAuth.share_phone_number = this.n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                kc kcVar = new kc((byte) 0);
                final boolean[] zArr = this.w;
                final my0 my0Var = this.x;
                final String str2 = this.y;
                final ylb ylbVar = this.E;
                final boolean z3 = this.F;
                final String str3 = this.G;
                final qw0 qw0Var = this.H;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, kcVar, new jac() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        CharSequence L2;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        b61.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        my0Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                c41 a = xp7.a();
                                String M0 = jb6.M0(2131753093, null);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    L2 = jb6.M0(2131753094, null);
                                } else {
                                    L2 = gm.L2(cmb.v0(cmb.wj, ylbVar), jb6.a0(null, null, 2131753095, str4));
                                }
                                a.I(2131624012, M0, L2).j();
                                return;
                            }
                            xp7.a().g0(tL_error, false);
                            return;
                        }
                        xp7.b(z3, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, qw0Var);
                    }
                });
            }
        }
    }
}
