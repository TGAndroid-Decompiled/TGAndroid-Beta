package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class sn7 implements Runnable {
    public final wjb E;
    public final boolean F;
    public final String G;
    public final hv0 H;
    public final u41 a;
    public final u41 b;
    public final TLRPC.TL_urlAuthResultRequest c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth e;
    public final String[] f;
    public final ahb h;
    public final boolean[] n;
    public final boolean[] r;
    public final int[] s;
    public final boolean[] w;
    public final fx0 x;
    public final String y;

    public sn7(u41 u41Var, u41 u41Var2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, ahb ahbVar, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, fx0 fx0Var, String str, wjb wjbVar, boolean z, String str2, hv0 hv0Var) {
        this.a = u41Var;
        this.b = u41Var2;
        this.c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f = strArr;
        this.h = ahbVar;
        this.n = zArr;
        this.r = zArr2;
        this.s = iArr;
        this.w = zArr3;
        this.x = fx0Var;
        this.y = str;
        this.E = wjbVar;
        this.F = z;
        this.G = str2;
        this.H = hv0Var;
    }

    @Override
    public final void run() {
        final u41 u41Var = this.a;
        if (!u41Var.R && !this.b.R) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.c;
            boolean z = tL_urlAuthResultRequest.request_wallet;
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
            if (!z || inputtonconnectoauthsessionArr[0] != null) {
                boolean z2 = true;
                u41Var.setLoading(true);
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
                ahb ahbVar = this.h;
                if (ahbVar == null || !ahbVar.e.h) {
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
                hc hcVar = new hc((byte) 0);
                final boolean[] zArr = this.w;
                final fx0 fx0Var = this.x;
                final String str2 = this.y;
                final wjb wjbVar = this.E;
                final boolean z3 = this.F;
                final String str3 = this.G;
                final hv0 hv0Var = this.H;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, hcVar, new i8c() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        CharSequence M2;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        u41.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        fx0Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                u21 a = un7.a();
                                String M0 = k96.M0(2131753125, null);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    M2 = k96.M0(2131753126, null);
                                } else {
                                    M2 = gl.M2(bkb.v0(bkb.wj, wjbVar), k96.a0(null, null, 2131753127, str4));
                                }
                                a.I(2131624012, M0, M2).j();
                                return;
                            }
                            un7.a().g0(tL_error, false);
                            return;
                        }
                        un7.b(z3, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, hv0Var);
                    }
                });
            }
        }
    }
}
