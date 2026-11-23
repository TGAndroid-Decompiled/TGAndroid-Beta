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
import org.telegram.messenger.gd;
import org.telegram.messenger.gp;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bn;
public final class g3 extends x7 {
    public final z3 A0;
    public final f9 f12015y0;
    public final org.telegram.ui.ActionBar.i6 f12016z0;

    public g3(z3 z3Var, Context context, b bVar, f9 f9Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, bVar);
        this.A0 = z3Var;
        this.f12015y0 = f9Var;
        this.f12016z0 = i6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.x5 x5Var) {
        if (x5Var != null) {
            z3 z3Var = this.A0;
            if (z3Var.A1 != null) {
                TLRPC.Document document = x5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.o5.e(z3Var.f12853m2, x5Var.documentId);
                }
                if (document != null) {
                    c3 c3Var = z3Var.M0;
                    org.telegram.ui.ActionBar.i6 i6Var = this.f12016z0;
                    fc h = new kc(c3Var, i6Var).h(document, 2, new bi.j(this, this.f12015y0, i6Var, 6));
                    if (h != null) {
                        h.f35084a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        f9 f9Var = this.f12015y0;
        org.telegram.ui.ActionBar.g2 g2Var = f9Var.f11972f;
        boolean z10 = characterStyle instanceof u41;
        z3 z3Var = this.A0;
        if (z10) {
            TLRPC.User c22 = mp.u1(z3Var.f12853m2).c2(Utilities.A(((u41) characterStyle).getURL()));
            if (c22 != null) {
                mp.u1(z3Var.f12853m2).G3(c22, null, g2Var, 0);
            }
        } else if (characterStyle instanceof r41) {
            String url = ((r41) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    f9Var.N(new c30(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                f9Var.N(new h90(bundle, null));
                return;
            }
            String c10 = vf.c.c(url);
            if (c10 != null) {
                String lowerCase = c10.toLowerCase();
                if (url.startsWith("@")) {
                    mp.u1(z3Var.f12853m2).F3(lowerCase, g2Var, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof t41);
        } else if (characterStyle instanceof q41) {
            q41 q41Var = (q41) characterStyle;
            org.telegram.messenger.g0.g(q41Var.f38687a.subSequence(q41Var.f38688b, q41Var.f38689c).toString());
            m10.t(null, 2131743949, new kc(z3Var.M0, this.f12016z0));
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f12016z0;
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        j3.P = str;
        j3.Q = false;
        j3.R = true;
        z3 z3Var = this.A0;
        x3 x3Var = z3Var.f12899y1;
        CharSequence[] charSequenceArr = (x3Var == null || x3Var.d()) ? new CharSequence[]{gd.N0(2131747623, null), gd.N0(2131751755, null)} : new CharSequence[]{gd.N0(2131747623, null)};
        final org.telegram.ui.ActionBar.i6 i6Var2 = this.f12016z0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i7) {
                g3 g3Var = g3.this;
                if (i7 == 0) {
                    g3Var.G(uRLSpan, view);
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new kc(g3Var.A0.M0, i6Var2).k(false).j();
                }
            }
        };
        j3.M = charSequenceArr;
        j3.L = onClickListener;
        j3.I0 = new u9(aVar, 3);
        j3.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, i6Var));
        ((w8) z3Var.A1).h(j3);
    }

    @Override
    public final void I(s7 s7Var) {
        if (s7Var == null) {
            return;
        }
        final TLRPC.Document document = s7Var.f12542g;
        z3 z3Var = this.A0;
        f9 f9Var = this.f12015y0;
        final org.telegram.ui.ActionBar.i6 i6Var = this.f12016z0;
        if (document != null) {
            x60 G = x60.G(f9Var.f12007w, i6Var, z3Var.f12882u0);
            G.f41873i = 3;
            G.b0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            G.l(2131232356, gd.N0(2131744481, null), new Runnable(this) {
                public final g3 f11849b;

                {
                    this.f11849b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    TLRPC.Document document2 = document;
                    g3 g3Var = this.f11849b;
                    switch (i7) {
                        case 0:
                            z3 z3Var2 = g3Var.A0;
                            zy C = zy.C(z3Var2.f12853m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = i10.i(z3Var2.f12853m2).e();
                            x3 x3Var = z3Var2.f12899y1;
                            if (x3Var != null) {
                                storyItem = x3Var.f12727a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(xy.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new kc(z3Var2.M0, i6Var2).Q(2131624191, 36, org.telegram.messenger.g0.R2(gd.N0(2131744480, null), -1, 2, new org.telegram.messenger.j2(27), null)).k(true);
                            return;
                        default:
                            z3 z3Var3 = g3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28520id = tL_inputDocument;
                            tL_inputDocument.f28504id = document2.f28498id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.f24391b == i10.i(z3Var3.f12853m2).e()) {
                                gp gpVar = MediaController.B().R0;
                                gpVar.f24392c.add(0, gpVar.d(document2));
                                gpVar.e();
                            }
                            ConnectionsManager.getInstance(z3Var3.f12853m2).sendRequest(tL_account_saveMusic, null);
                            new kc(z3Var3.M0, i6Var2).Q(2131624058, 36, gd.N0(2131744482, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            G.c(2131232406, gd.N0(2131744483, null), new Runnable(this) {
                public final g3 f11849b;

                {
                    this.f11849b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    TLRPC.Document document2 = document;
                    g3 g3Var = this.f11849b;
                    switch (i7) {
                        case 0:
                            z3 z3Var2 = g3Var.A0;
                            zy C = zy.C(z3Var2.f12853m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = i10.i(z3Var2.f12853m2).e();
                            x3 x3Var = z3Var2.f12899y1;
                            if (x3Var != null) {
                                storyItem = x3Var.f12727a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(xy.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new kc(z3Var2.M0, i6Var2).Q(2131624191, 36, org.telegram.messenger.g0.R2(gd.N0(2131744480, null), -1, 2, new org.telegram.messenger.j2(27), null)).k(true);
                            return;
                        default:
                            z3 z3Var3 = g3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28520id = tL_inputDocument;
                            tL_inputDocument.f28504id = document2.f28498id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.f24391b == i10.i(z3Var3.f12853m2).e()) {
                                gp gpVar = MediaController.B().R0;
                                gpVar.f24392c.add(0, gpVar.d(document2));
                                gpVar.e();
                            }
                            ConnectionsManager.getInstance(z3Var3.f12853m2).sendRequest(tL_account_saveMusic, null);
                            new kc(z3Var3.M0, i6Var2).Q(2131624058, 36, gd.N0(2131744482, null)).k(true);
                            return;
                    }
                }
            }, false);
            G.a0();
        } else if (s7Var.f12540e && s7Var.f12538b != null && s7Var.d != null) {
            Bundle bundle = new Bundle();
            if (s7Var.f12538b.longValue() >= 0) {
                bundle.putLong("user_id", s7Var.f12538b.longValue());
            } else {
                bundle.putLong("chat_id", -s7Var.f12538b.longValue());
            }
            bundle.putInt("message_id", s7Var.d.intValue());
            f9Var.N(new bn(bundle));
        } else if (s7Var.f12538b != null && s7Var.f12539c != null) {
            mp.u1(z3Var.f12853m2).R1().g0(s7Var.f12539c.intValue(), s7Var.f12538b.longValue(), new bi.o2(this, s7Var, f9Var, i6Var, 2));
        } else {
            fc Q = new kc(z3Var.M0, i6Var).Q(2131624012, 36, gd.N0(2131744420, null));
            Q.f35084a = 3;
            Q.k(true);
        }
    }

    public final void M(int i7, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        ez0 ez0Var;
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
        f9 f9Var = this.f12015y0;
        if (i7 != 0 && i7 != 2) {
            if (i7 == 1) {
                org.telegram.ui.Components.b5.o0(f9Var.f11972f, str, true, true, false, false, null, null, this.f12016z0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof t41) && (ez0Var = ((t41) characterStyle).f39795a) != null && (ez0Var.f34924a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.b5.o0(f9Var.f11972f, str, true, true, true, z11, null, null, this.f12016z0);
    }
}
