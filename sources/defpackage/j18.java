package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.p;
public final class j18 extends WebViewClient {
    public final byte a;
    public final Context b;
    public final p c;

    public j18(p pVar, Context context, byte b) {
        this.a = b;
        this.c = pVar;
        this.b = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        byte b = this.a;
        p pVar = this.c;
        switch (b) {
            case 0:
                super.onPageFinished(webView, str);
                pVar.A0 = false;
                pVar.N0(true, false);
                pVar.Q0();
                return;
            default:
                super.onPageFinished(webView, str);
                pVar.A0 = false;
                pVar.N0(true, false);
                pVar.Q0();
                return;
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        byte b = this.a;
        p pVar = this.c;
        switch (b) {
            case 0:
                try {
                    if (!gm.K1(pVar.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, pVar.Z0, pVar.getParentActivity());
                    he heVar = alertDialog$Builder.a;
                    heVar.S = jb6.M0(2131752041, null);
                    heVar.U = gm.N2(jb6.M0(2131752042, null), -1, 0, new kl7(this, (byte) 18), null);
                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                    alertDialog$Builder.o();
                    return true;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return false;
                }
            default:
                try {
                    if (!gm.K1(pVar.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, pVar.Z0, pVar.getParentActivity());
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.S = jb6.M0(2131752041, null);
                    heVar2.U = gm.N2(jb6.M0(2131752042, null), -1, 0, new kl7(this, (byte) 20), null);
                    alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                    alertDialog$Builder2.o();
                    return true;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return false;
                }
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        Uri parse;
        byte b = this.a;
        Context context = this.b;
        boolean z2 = false;
        p pVar = this.c;
        switch (b) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        pVar.i0();
                    } else if (!p.i1.contains(parse2.getScheme())) {
                        if (p.h1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (pVar.getParentActivity() != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                pVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = pVar.q0;
                            heVar.U = jb6.M0(2131747162, null);
                            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                            alertDialog$Builder.o();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                pVar.E = !str.equals(pVar.y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                }
                if ("t.me".equals(parse.getHost())) {
                    pVar.i0();
                    return true;
                } else if (p.i1.contains(parse.getScheme())) {
                    return true;
                } else {
                    if (!p.h1.contains(parse.getScheme())) {
                        try {
                            if (pVar.getParentActivity() != null) {
                                z2 = true;
                            }
                            if (!z2) {
                                return true;
                            }
                            pVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            return true;
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            he heVar2 = alertDialog$Builder2.a;
                            heVar2.S = pVar.q0;
                            heVar2.U = jb6.M0(2131747162, null);
                            alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                            alertDialog$Builder2.o();
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
        }
    }
}
