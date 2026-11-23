package fi;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import di.u9;
import java.net.URLDecoder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v41;
import org.telegram.ui.bn;
public final class g3 extends x7 {
    public final z3 A0;
    public final f9 f12053y0;
    public final org.telegram.ui.ActionBar.h6 f12054z0;

    public g3(z3 z3Var, Context context, b bVar, f9 f9Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, bVar);
        this.A0 = z3Var;
        this.f12053y0 = f9Var;
        this.f12054z0 = h6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.y5 y5Var) {
        if (y5Var != null) {
            z3 z3Var = this.A0;
            if (z3Var.A1 != null) {
                TLRPC.Document document = y5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.p5.e(z3Var.f12891m2, y5Var.documentId);
                }
                if (document != null) {
                    c3 c3Var = z3Var.M0;
                    org.telegram.ui.ActionBar.h6 h6Var = this.f12054z0;
                    gc h = new lc(c3Var, h6Var).h(document, 2, new bi.j(this, this.f12053y0, h6Var, 6));
                    if (h != null) {
                        h.f35520a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        f9 f9Var = this.f12053y0;
        org.telegram.ui.ActionBar.g2 g2Var = f9Var.f12010f;
        boolean z10 = characterStyle instanceof v41;
        z3 z3Var = this.A0;
        if (z10) {
            TLRPC.User c22 = np.u1(z3Var.f12891m2).c2(Utilities.A(((v41) characterStyle).getURL()));
            if (c22 != null) {
                np.u1(z3Var.f12891m2).G3(c22, null, g2Var, 0);
            }
        } else if (characterStyle instanceof s41) {
            String url = ((s41) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    f9Var.N(new f30(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                f9Var.N(new k90(bundle, null));
                return;
            }
            String c10 = vf.c.c(url);
            if (c10 != null) {
                String lowerCase = c10.toLowerCase();
                if (url.startsWith("@")) {
                    np.u1(z3Var.f12891m2).F3(lowerCase, g2Var, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof u41);
        } else if (characterStyle instanceof r41) {
            r41 r41Var = (r41) characterStyle;
            org.telegram.messenger.g0.g(r41Var.f39072a.subSequence(r41Var.f39073b, r41Var.f39074c).toString());
            o10.t(null, 2131743951, new lc(z3Var.M0, this.f12054z0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, f2.a aVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null);
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
        org.telegram.ui.ActionBar.h6 h6Var = this.f12054z0;
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        j3.P = str;
        j3.Q = false;
        j3.R = true;
        z3 z3Var = this.A0;
        x3 x3Var = z3Var.f12937y1;
        CharSequence[] charSequenceArr = (x3Var == null || x3Var.d()) ? new CharSequence[]{hd.N0(2131747623, null), hd.N0(2131751755, null)} : new CharSequence[]{hd.N0(2131747623, null)};
        final org.telegram.ui.ActionBar.h6 h6Var2 = this.f12054z0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i7) {
                g3 g3Var = g3.this;
                if (i7 == 0) {
                    g3Var.G(uRLSpan, view);
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new lc(g3Var.A0.M0, h6Var2).k(false).j();
                }
            }
        };
        j3.M = charSequenceArr;
        j3.L = onClickListener;
        j3.I0 = new u9(aVar, 3);
        j3.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, h6Var));
        ((w8) z3Var.A1).h(j3);
    }

    @Override
    public final void I(s7 s7Var) {
        if (s7Var == null) {
            return;
        }
        final TLRPC.Document document = s7Var.f12580g;
        z3 z3Var = this.A0;
        f9 f9Var = this.f12053y0;
        final org.telegram.ui.ActionBar.h6 h6Var = this.f12054z0;
        if (document != null) {
            a70 G = a70.G(f9Var.f12045w, h6Var, z3Var.f12920u0);
            G.f33378i = 3;
            G.b0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            G.l(2131232353, hd.N0(2131744479, null), new Runnable(this) {
                public final g3 f11887b;

                {
                    this.f11887b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                    TLRPC.Document document2 = document;
                    g3 g3Var = this.f11887b;
                    switch (i7) {
                        case 0:
                            z3 z3Var2 = g3Var.A0;
                            az C = az.C(z3Var2.f12891m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = k10.i(z3Var2.f12891m2).e();
                            x3 x3Var = z3Var2.f12937y1;
                            if (x3Var != null) {
                                storyItem = x3Var.f12765a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(yy.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new lc(z3Var2.M0, h6Var2).Q(2131624191, 36, org.telegram.messenger.g0.R2(hd.N0(2131744478, null), -1, 2, new org.telegram.messenger.j2(27), null)).k(true);
                            return;
                        default:
                            z3 z3Var3 = g3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28462id = tL_inputDocument;
                            tL_inputDocument.f28446id = document2.f28440id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.f24521b == k10.i(z3Var3.f12891m2).e()) {
                                hp hpVar = MediaController.B().R0;
                                hpVar.f24522c.add(0, hpVar.d(document2));
                                hpVar.e();
                            }
                            ConnectionsManager.getInstance(z3Var3.f12891m2).sendRequest(tL_account_saveMusic, null);
                            new lc(z3Var3.M0, h6Var2).Q(2131624058, 36, hd.N0(2131744480, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            G.c(2131232403, hd.N0(2131744481, null), new Runnable(this) {
                public final g3 f11887b;

                {
                    this.f11887b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                    TLRPC.Document document2 = document;
                    g3 g3Var = this.f11887b;
                    switch (i7) {
                        case 0:
                            z3 z3Var2 = g3Var.A0;
                            az C = az.C(z3Var2.f12891m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = k10.i(z3Var2.f12891m2).e();
                            x3 x3Var = z3Var2.f12937y1;
                            if (x3Var != null) {
                                storyItem = x3Var.f12765a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(yy.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new lc(z3Var2.M0, h6Var2).Q(2131624191, 36, org.telegram.messenger.g0.R2(hd.N0(2131744478, null), -1, 2, new org.telegram.messenger.j2(27), null)).k(true);
                            return;
                        default:
                            z3 z3Var3 = g3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28462id = tL_inputDocument;
                            tL_inputDocument.f28446id = document2.f28440id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.f24521b == k10.i(z3Var3.f12891m2).e()) {
                                hp hpVar = MediaController.B().R0;
                                hpVar.f24522c.add(0, hpVar.d(document2));
                                hpVar.e();
                            }
                            ConnectionsManager.getInstance(z3Var3.f12891m2).sendRequest(tL_account_saveMusic, null);
                            new lc(z3Var3.M0, h6Var2).Q(2131624058, 36, hd.N0(2131744480, null)).k(true);
                            return;
                    }
                }
            }, false);
            G.a0();
        } else if (s7Var.f12578e && s7Var.f12576b != null && s7Var.d != null) {
            Bundle bundle = new Bundle();
            if (s7Var.f12576b.longValue() >= 0) {
                bundle.putLong("user_id", s7Var.f12576b.longValue());
            } else {
                bundle.putLong("chat_id", -s7Var.f12576b.longValue());
            }
            bundle.putInt("message_id", s7Var.d.intValue());
            f9Var.N(new bn(bundle));
        } else if (s7Var.f12576b != null && s7Var.f12577c != null) {
            np.u1(z3Var.f12891m2).R1().g0(s7Var.f12577c.intValue(), s7Var.f12576b.longValue(), new bi.m2(this, s7Var, f9Var, h6Var, 2));
        } else {
            gc Q = new lc(z3Var.M0, h6Var).Q(2131624012, 36, hd.N0(2131744421, null));
            Q.f35520a = 3;
            Q.k(true);
        }
    }

    public final void M(int i7, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        fz0 fz0Var;
        if (!z10 && !org.telegram.messenger.g0.H3(str)) {
            if (i7 == 0) {
                vf.c.r(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i7 == 1) {
                vf.c.r(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i7 == 2) {
                vf.c.r(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        f9 f9Var = this.f12053y0;
        if (i7 != 0 && i7 != 2) {
            if (i7 == 1) {
                org.telegram.ui.Components.c5.o0(f9Var.f12010f, str, true, true, false, false, null, null, this.f12054z0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof u41) && (fz0Var = ((u41) characterStyle).f40260a) != null && (fz0Var.f35337a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.c5.o0(f9Var.f12010f, str, true, true, true, z11, null, null, this.f12054z0);
    }
}
