package fi;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import java.net.URLDecoder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;
public final class i3 extends a8 {
    public final b4 A0;
    public final i9 f11813y0;
    public final org.telegram.ui.ActionBar.e6 f11814z0;

    public i3(b4 b4Var, Context context, b bVar, i9 i9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, bVar);
        this.A0 = b4Var;
        this.f11813y0 = i9Var;
        this.f11814z0 = e6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.p5 p5Var) {
        if (p5Var != null) {
            b4 b4Var = this.A0;
            if (b4Var.A1 != null) {
                TLRPC.Document document = p5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.g5.e(b4Var.f11497m2, p5Var.documentId);
                }
                if (document != null) {
                    e3 e3Var = b4Var.M0;
                    org.telegram.ui.ActionBar.e6 e6Var = this.f11814z0;
                    xb h = new cc(e3Var, e6Var).h(document, 2, new bi.j(this, this.f11813y0, e6Var, 3));
                    if (h != null) {
                        h.f41636a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        i9 i9Var = this.f11813y0;
        org.telegram.ui.ActionBar.e2 e2Var = i9Var.f11844f;
        boolean z10 = characterStyle instanceof i41;
        b4 b4Var = this.A0;
        if (z10) {
            TLRPC.User a22 = np.s1(b4Var.f11497m2).a2(Utilities.A(((i41) characterStyle).getURL()));
            if (a22 != null) {
                np.s1(b4Var.f11497m2).z3(a22, null, e2Var, 0);
            }
        } else if (characterStyle instanceof f41) {
            String url = ((f41) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    i9Var.N(new u20(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                i9Var.N(new x80(bundle, null));
                return;
            }
            String c10 = vf.c.c(url);
            if (c10 != null) {
                String lowerCase = c10.toLowerCase();
                if (url.startsWith("@")) {
                    np.s1(b4Var.f11497m2).y3(lowerCase, e2Var, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof h41);
        } else if (characterStyle instanceof e41) {
            e41 e41Var = (e41) characterStyle;
            org.telegram.messenger.g0.g(e41Var.f34186a.subSequence(e41Var.f34187b, e41Var.f34188c).toString());
            i20.s(null, 2131744194, new cc(b4Var.M0, this.f11814z0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, c1 c1Var) {
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f11814z0;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        k10.P = str;
        k10.Q = false;
        k10.R = true;
        b4 b4Var = this.A0;
        z3 z3Var = b4Var.f11543y1;
        CharSequence[] charSequenceArr = (z3Var == null || z3Var.d()) ? new CharSequence[]{hd.M0(2131747817, null), hd.M0(2131751767, null)} : new CharSequence[]{hd.M0(2131747817, null)};
        final org.telegram.ui.ActionBar.e6 e6Var2 = this.f11814z0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i7) {
                i3 i3Var = i3.this;
                if (i7 == 0) {
                    i3Var.G(uRLSpan, view);
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new cc(i3Var.A0.M0, e6Var2).k(false).j();
                }
            }
        };
        k10.M = charSequenceArr;
        k10.L = onClickListener;
        k10.I0 = new di.r9(c1Var, 3);
        k10.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, e6Var));
        ((z8) b4Var.A1).h(k10);
    }

    @Override
    public final void I(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        final TLRPC.Document document = v7Var.f12433g;
        b4 b4Var = this.A0;
        i9 i9Var = this.f11813y0;
        final org.telegram.ui.ActionBar.e6 e6Var = this.f11814z0;
        if (document != null) {
            m60 F = m60.F(i9Var.f11879w, e6Var, b4Var.f11526u0);
            F.f37093i = 3;
            F.a0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            F.l(2131232352, hd.M0(2131744722, null), new Runnable(this) {
                public final i3 f11699b;

                {
                    this.f11699b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    TLRPC.Document document2 = document;
                    i3 i3Var = this.f11699b;
                    switch (i7) {
                        case 0:
                            b4 b4Var2 = i3Var.A0;
                            ez C = ez.C(b4Var2.f11497m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = m10.i(b4Var2.f11497m2).e();
                            z3 z3Var = b4Var2.f11543y1;
                            if (z3Var != null) {
                                storyItem = z3Var.f12579a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(cz.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new cc(b4Var2.M0, e6Var2).Q(2131624191, 36, org.telegram.messenger.g0.S2(hd.M0(2131744721, null), -1, 2, new org.telegram.messenger.c6(25), null)).k(true);
                            return;
                        default:
                            b4 b4Var3 = i3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28079id = tL_inputDocument;
                            tL_inputDocument.f28063id = document2.f28057id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.f24201b == m10.i(b4Var3.f11497m2).e()) {
                                hp hpVar = MediaController.B().R0;
                                hpVar.f24202c.add(0, hpVar.d(document2));
                                hpVar.e();
                            }
                            ConnectionsManager.getInstance(b4Var3.f11497m2).sendRequest(tL_account_saveMusic, null);
                            new cc(b4Var3.M0, e6Var2).Q(2131624058, 36, hd.M0(2131744723, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(2131232402, hd.M0(2131744724, null), new Runnable(this) {
                public final i3 f11699b;

                {
                    this.f11699b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    TLRPC.Document document2 = document;
                    i3 i3Var = this.f11699b;
                    switch (i7) {
                        case 0:
                            b4 b4Var2 = i3Var.A0;
                            ez C = ez.C(b4Var2.f11497m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = m10.i(b4Var2.f11497m2).e();
                            z3 z3Var = b4Var2.f11543y1;
                            if (z3Var != null) {
                                storyItem = z3Var.f12579a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(cz.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new cc(b4Var2.M0, e6Var2).Q(2131624191, 36, org.telegram.messenger.g0.S2(hd.M0(2131744721, null), -1, 2, new org.telegram.messenger.c6(25), null)).k(true);
                            return;
                        default:
                            b4 b4Var3 = i3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f28079id = tL_inputDocument;
                            tL_inputDocument.f28063id = document2.f28057id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.f24201b == m10.i(b4Var3.f11497m2).e()) {
                                hp hpVar = MediaController.B().R0;
                                hpVar.f24202c.add(0, hpVar.d(document2));
                                hpVar.e();
                            }
                            ConnectionsManager.getInstance(b4Var3.f11497m2).sendRequest(tL_account_saveMusic, null);
                            new cc(b4Var3.M0, e6Var2).Q(2131624058, 36, hd.M0(2131744723, null)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (v7Var.f12431e && v7Var.f12429b != null && v7Var.d != null) {
            Bundle bundle = new Bundle();
            if (v7Var.f12429b.longValue() >= 0) {
                bundle.putLong("user_id", v7Var.f12429b.longValue());
            } else {
                bundle.putLong("chat_id", -v7Var.f12429b.longValue());
            }
            bundle.putInt("message_id", v7Var.d.intValue());
            i9Var.N(new an(bundle));
        } else if (v7Var.f12429b != null && v7Var.f12430c != null) {
            np.s1(b4Var.f11497m2).P1().g0(v7Var.f12430c.intValue(), v7Var.f12429b.longValue(), new bi.o1(this, v7Var, i9Var, e6Var, 2));
        } else {
            xb Q = new cc(b4Var.M0, e6Var).Q(2131624012, 36, hd.M0(2131744664, null));
            Q.f41636a = 3;
            Q.k(true);
        }
    }

    public final void M(int i7, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        wy0 wy0Var;
        if (!z10 && !org.telegram.messenger.g0.I3(str)) {
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
        i9 i9Var = this.f11813y0;
        if (i7 != 0 && i7 != 2) {
            if (i7 == 1) {
                org.telegram.ui.Components.t4.o0(i9Var.f11844f, str, true, true, false, false, null, null, this.f11814z0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof h41) && (wy0Var = ((h41) characterStyle).f35164a) != null && (wy0Var.f41484a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.t4.o0(i9Var.f11844f, str, true, true, true, z11, null, null, this.f11814z0);
    }
}
