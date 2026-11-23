package ji;

import ai.u;
import ai.v1;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.messenger.g0;
import org.telegram.messenger.wr;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qf;
public final class g implements y10 {
    public final int f17932a;
    public final n f17933b;

    public g(n nVar, int i7) {
        this.f17932a = i7;
        this.f17933b = nVar;
    }

    @Override
    public final void a(Object obj) {
        q qVar;
        String str;
        int G0;
        switch (this.f17932a) {
            case 0:
                n nVar = this.f17933b;
                String str2 = (String) obj;
                if (nVar.f17960c == 3 && (qVar = nVar.h) != null) {
                    qVar.setBusy(false);
                    if (str2 != null && !str2.trim().isEmpty()) {
                        nVar.f17973n = str2;
                        nVar.h.r(str2);
                        return;
                    }
                    return;
                }
                return;
            default:
                n nVar2 = this.f17933b;
                if (!nVar2.f17973n.trim().isEmpty()) {
                    qf qfVar = nVar2.f17958b;
                    String trim = nVar2.f17973n.trim();
                    if (!trim.isEmpty() && nVar2.h != null) {
                        g0.r(nVar2.f17971k0);
                        g0.r(nVar2.f17970j0);
                        Drawable drawable = null;
                        if (wr.f27759k == nVar2) {
                            wr.f27759k = null;
                        }
                        v1 v1Var = nVar2.f17965f;
                        if (v1Var != null) {
                            v1Var.c();
                            nVar2.f17965f = null;
                        }
                        u uVar = nVar2.d;
                        if (uVar != null) {
                            uVar.d();
                            nVar2.d = null;
                        }
                        nVar2.f17963e = null;
                        nVar2.f17960c = 3;
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
                        ChatActivityEnterView chatActivityEnterView = qfVar.f38848a;
                        if (z10) {
                            ai.c cVar = (ai.c) obj;
                            long j3 = cVar.f1143b;
                            if (j3 != 0) {
                                drawable = p5.m(chatActivityEnterView.R, j3, null, 2);
                            } else if (cVar.d) {
                                drawable = new v2(chatActivityEnterView.getContext());
                                if (m6.I.q()) {
                                    G0 = -1;
                                } else {
                                    int i7 = m6.G6;
                                    int i10 = ChatActivityEnterView.f32535s7;
                                    G0 = chatActivityEnterView.G0(i7);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        qVar3.setStyleIcon(drawable);
                        nVar2.h.setReview(true);
                        nVar2.h.setBusy(true);
                        qfVar.f(obj, nVar2.H, new g(nVar2, 0));
                        g0.h3(nVar2.I, 400L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
