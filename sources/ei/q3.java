package ei;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import ci.ba;
import java.net.URLDecoder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.bp;
import org.telegram.messenger.h10;
import org.telegram.messenger.hc;
import org.telegram.messenger.hp;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
import org.telegram.ui.wm;
public final class q3 extends h8 {
    public final j4 A0;
    public final r9 f10801y0;
    public final org.telegram.ui.ActionBar.e6 f10802z0;

    public q3(j4 j4Var, Context context, b bVar, r9 r9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, bVar);
        this.A0 = j4Var;
        this.f10801y0 = r9Var;
        this.f10802z0 = e6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.p5 p5Var) {
        if (p5Var != null) {
            j4 j4Var = this.A0;
            if (j4Var.A1 != null) {
                TLRPC.Document document = p5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.g5.e(j4Var.f10480m2, p5Var.documentId);
                }
                if (document != null) {
                    m3 m3Var = j4Var.M0;
                    org.telegram.ui.ActionBar.e6 e6Var = this.f10802z0;
                    ac h = new fc(m3Var, e6Var).h(document, 2, new ai.m(this, this.f10801y0, e6Var, 3));
                    if (h != null) {
                        h.f31785a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        r9 r9Var = this.f10801y0;
        org.telegram.ui.ActionBar.d2 d2Var = r9Var.f10922f;
        boolean z10 = characterStyle instanceof y31;
        j4 j4Var = this.A0;
        if (z10) {
            TLRPC.User a22 = hp.s1(j4Var.f10480m2).a2(Utilities.A(((y31) characterStyle).getURL()));
            if (a22 != null) {
                hp.s1(j4Var.f10480m2).z3(a22, null, d2Var, 0);
            }
        } else if (characterStyle instanceof v31) {
            String url = ((v31) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    r9Var.V(new n20(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                r9Var.V(new r80(bundle, null));
                return;
            }
            String c2 = sf.c.c(url);
            if (c2 != null) {
                String lowerCase = c2.toLowerCase();
                if (url.startsWith("@")) {
                    hp.s1(j4Var.f10480m2).y3(lowerCase, d2Var, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof x31);
        } else if (characterStyle instanceof u31) {
            u31 u31Var = (u31) characterStyle;
            org.telegram.messenger.g0.g(u31Var.f38635a.subSequence(u31Var.f38636b, u31Var.f38637c).toString());
            org.telegram.messenger.camera.q.r(null, 2131744204, new fc(j4Var.M0, this.f10802z0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, z5 z5Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = sf.c.w(parse, null, null, sf.c.a(parse.getHost()), null);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.f10802z0;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        l10.P = str;
        l10.Q = false;
        l10.R = true;
        j4 j4Var = this.A0;
        h4 h4Var = j4Var.f10527y1;
        CharSequence[] charSequenceArr = (h4Var == null || h4Var.d()) ? new CharSequence[]{bd.M0(2131747825, null), bd.M0(2131751767, null)} : new CharSequence[]{bd.M0(2131747825, null)};
        final org.telegram.ui.ActionBar.e6 e6Var2 = this.f10802z0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                q3 q3Var = q3.this;
                if (i3 == 0) {
                    q3Var.G(uRLSpan, view);
                } else if (i3 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new fc(q3Var.A0.M0, e6Var2).k(false).j();
                }
            }
        };
        l10.M = charSequenceArr;
        l10.L = onClickListener;
        l10.I0 = new ba(z5Var, 3);
        l10.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, e6Var));
        ((i9) j4Var.A1).h(l10);
    }

    @Override
    public final void I(c8 c8Var) {
        if (c8Var == null) {
            return;
        }
        final TLRPC.Document document = c8Var.f10166g;
        j4 j4Var = this.A0;
        r9 r9Var = this.f10801y0;
        final org.telegram.ui.ActionBar.e6 e6Var = this.f10802z0;
        if (document != null) {
            f60 F = f60.F(r9Var.f10957w, e6Var, j4Var.f10510u0);
            F.f33729i = 3;
            F.a0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            F.l(2131232351, bd.M0(2131744732, null), new Runnable(this) {
                public final q3 f10663b;

                {
                    this.f10663b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i3 = r4;
                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    TLRPC.Document document2 = document;
                    q3 q3Var = this.f10663b;
                    switch (i3) {
                        case 0:
                            j4 j4Var2 = q3Var.A0;
                            yy C = yy.C(j4Var2.f10480m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = h10.i(j4Var2.f10480m2).e();
                            h4 h4Var = j4Var2.f10527y1;
                            if (h4Var != null) {
                                storyItem = h4Var.f10358a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(wy.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new fc(j4Var2.M0, e6Var2).Q(2131624190, 36, org.telegram.messenger.g0.S2(bd.M0(2131744731, null), -1, 2, new hc(23), null)).k(true);
                            return;
                        default:
                            j4 j4Var3 = q3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f27029id = tL_inputDocument;
                            tL_inputDocument.f27013id = document2.f27007id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.f21865b == h10.i(j4Var3.f10480m2).e()) {
                                bp bpVar = MediaController.B().R0;
                                bpVar.f21866c.add(0, bpVar.d(document2));
                                bpVar.e();
                            }
                            ConnectionsManager.getInstance(j4Var3.f10480m2).sendRequest(tL_account_saveMusic, null);
                            new fc(j4Var3.M0, e6Var2).Q(2131624057, 36, bd.M0(2131744733, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(2131232401, bd.M0(2131744734, null), new Runnable(this) {
                public final q3 f10663b;

                {
                    this.f10663b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i3 = r4;
                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    TLRPC.Document document2 = document;
                    q3 q3Var = this.f10663b;
                    switch (i3) {
                        case 0:
                            j4 j4Var2 = q3Var.A0;
                            yy C = yy.C(j4Var2.f10480m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = h10.i(j4Var2.f10480m2).e();
                            h4 h4Var = j4Var2.f10527y1;
                            if (h4Var != null) {
                                storyItem = h4Var.f10358a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(wy.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new fc(j4Var2.M0, e6Var2).Q(2131624190, 36, org.telegram.messenger.g0.S2(bd.M0(2131744731, null), -1, 2, new hc(23), null)).k(true);
                            return;
                        default:
                            j4 j4Var3 = q3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f27029id = tL_inputDocument;
                            tL_inputDocument.f27013id = document2.f27007id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.f21865b == h10.i(j4Var3.f10480m2).e()) {
                                bp bpVar = MediaController.B().R0;
                                bpVar.f21866c.add(0, bpVar.d(document2));
                                bpVar.e();
                            }
                            ConnectionsManager.getInstance(j4Var3.f10480m2).sendRequest(tL_account_saveMusic, null);
                            new fc(j4Var3.M0, e6Var2).Q(2131624057, 36, bd.M0(2131744733, null)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (c8Var.f10164e && c8Var.f10162b != null && c8Var.d != null) {
            Bundle bundle = new Bundle();
            if (c8Var.f10162b.longValue() >= 0) {
                bundle.putLong("user_id", c8Var.f10162b.longValue());
            } else {
                bundle.putLong("chat_id", -c8Var.f10162b.longValue());
            }
            bundle.putInt("message_id", c8Var.d.intValue());
            r9Var.V(new wm(bundle));
        } else if (c8Var.f10162b != null && c8Var.f10163c != null) {
            hp.s1(j4Var.f10480m2).P1().g0(c8Var.f10163c.intValue(), c8Var.f10162b.longValue(), new ai.v1(this, c8Var, r9Var, e6Var, 2));
        } else {
            ac Q = new fc(j4Var.M0, e6Var).Q(2131624011, 36, bd.M0(2131744674, null));
            Q.f31785a = 3;
            Q.k(true);
        }
    }

    public final void M(int i3, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        ty0 ty0Var;
        if (!z10 && !org.telegram.messenger.g0.J3(str)) {
            if (i3 == 0) {
                sf.c.r(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i3 == 1) {
                sf.c.r(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i3 == 2) {
                sf.c.r(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        r9 r9Var = this.f10801y0;
        if (i3 != 0 && i3 != 2) {
            if (i3 == 1) {
                org.telegram.ui.Components.t4.q0(r9Var.f10922f, str, true, true, false, false, null, null, this.f10802z0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof x31) && (ty0Var = ((x31) characterStyle).f40213a) != null && (ty0Var.f38578a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.t4.q0(r9Var.f10922f, str, true, true, true, z11, null, null, this.f10802z0);
    }
}
