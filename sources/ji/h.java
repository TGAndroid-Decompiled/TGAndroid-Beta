package ji;

import ai.v;
import ai.w1;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.messenger.g0;
import org.telegram.messenger.vr;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.qf;
public final class h implements w10 {
    public final int f18037a;
    public final n f18038b;

    public h(n nVar, int i7) {
        this.f18037a = i7;
        this.f18038b = nVar;
    }

    @Override
    public final void a(Object obj) {
        q qVar;
        String str;
        int G0;
        switch (this.f18037a) {
            case 0:
                n nVar = this.f18038b;
                String str2 = (String) obj;
                if (nVar.f18062c == 3 && (qVar = nVar.h) != null) {
                    qVar.setBusy(false);
                    if (str2 != null && !str2.trim().isEmpty()) {
                        nVar.f18075n = str2;
                        nVar.h.r(str2);
                        return;
                    }
                    return;
                }
                return;
            default:
                n nVar2 = this.f18038b;
                if (!nVar2.f18075n.trim().isEmpty()) {
                    qf qfVar = nVar2.f18060b;
                    String trim = nVar2.f18075n.trim();
                    if (!trim.isEmpty() && nVar2.h != null) {
                        g0.r(nVar2.f18073k0);
                        g0.r(nVar2.f18072j0);
                        Drawable drawable = null;
                        if (vr.f27687k == nVar2) {
                            vr.f27687k = null;
                        }
                        w1 w1Var = nVar2.f18067f;
                        if (w1Var != null) {
                            w1Var.c();
                            nVar2.f18067f = null;
                        }
                        v vVar = nVar2.d;
                        if (vVar != null) {
                            vVar.d();
                            nVar2.d = null;
                        }
                        nVar2.f18065e = null;
                        nVar2.f18062c = 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        nVar2.h.setListening(false);
                        qfVar.e();
                        if (nVar2.H == null) {
                            nVar2.H = trim;
                        }
                        q qVar2 = nVar2.h;
                        boolean z10 = obj instanceof ai.c;
                        if (z10) {
                            str = ((ai.c) obj).a();
                        } else {
                            str = null;
                        }
                        qVar2.setStyleLabel(str);
                        q qVar3 = nVar2.h;
                        ChatActivityEnterView chatActivityEnterView = qfVar.f38823a;
                        if (z10) {
                            ai.c cVar = (ai.c) obj;
                            long j3 = cVar.f1143b;
                            if (j3 != 0) {
                                drawable = o5.m(chatActivityEnterView.R, j3, null, 2);
                            } else if (cVar.d) {
                                drawable = new v2(chatActivityEnterView.getContext());
                                if (n6.I.q()) {
                                    G0 = -1;
                                } else {
                                    int i7 = n6.G6;
                                    int i10 = ChatActivityEnterView.f32633s7;
                                    G0 = chatActivityEnterView.G0(i7);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        qVar3.setStyleIcon(drawable);
                        nVar2.h.setReview(true);
                        nVar2.h.setBusy(true);
                        qfVar.f(obj, nVar2.H, new h(nVar2, 0));
                        g0.h3(nVar2.I, 400L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
