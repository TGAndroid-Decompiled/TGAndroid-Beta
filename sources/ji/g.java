package ji;

import ai.f2;
import ai.z;
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
import org.telegram.ui.Components.rf;
public final class g implements y10 {
    public final int f17966a;
    public final o f17967b;

    public g(o oVar, int i7) {
        this.f17966a = i7;
        this.f17967b = oVar;
    }

    @Override
    public final void a(Object obj) {
        r rVar;
        String str;
        int G0;
        switch (this.f17966a) {
            case 0:
                o oVar = this.f17967b;
                String str2 = (String) obj;
                if (oVar.f17997c == 3 && (rVar = oVar.h) != null) {
                    rVar.setBusy(false);
                    if (str2 != null && !str2.trim().isEmpty()) {
                        oVar.f18010n = str2;
                        oVar.h.r(str2);
                        return;
                    }
                    return;
                }
                return;
            default:
                o oVar2 = this.f17967b;
                if (!oVar2.f18010n.trim().isEmpty()) {
                    rf rfVar = oVar2.f17995b;
                    String trim = oVar2.f18010n.trim();
                    if (!trim.isEmpty() && oVar2.h != null) {
                        g0.r(oVar2.f18008k0);
                        g0.r(oVar2.f18007j0);
                        Drawable drawable = null;
                        if (wr.f27795k == oVar2) {
                            wr.f27795k = null;
                        }
                        f2 f2Var = oVar2.f18002f;
                        if (f2Var != null) {
                            f2Var.d();
                            oVar2.f18002f = null;
                        }
                        z zVar = oVar2.d;
                        if (zVar != null) {
                            zVar.d();
                            oVar2.d = null;
                        }
                        oVar2.f18000e = null;
                        oVar2.f17997c = 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        oVar2.h.setListening(false);
                        rfVar.e();
                        if (oVar2.H == null) {
                            oVar2.H = trim;
                        }
                        r rVar2 = oVar2.h;
                        boolean z10 = obj instanceof ai.g;
                        if (z10) {
                            str = ((ai.g) obj).a();
                        } else {
                            str = null;
                        }
                        rVar2.setStyleLabel(str);
                        r rVar3 = oVar2.h;
                        ChatActivityEnterView chatActivityEnterView = rfVar.f39178a;
                        if (z10) {
                            ai.g gVar = (ai.g) obj;
                            long j3 = gVar.f1210b;
                            if (j3 != 0) {
                                drawable = p5.m(chatActivityEnterView.R, j3, null, 2);
                            } else if (gVar.d) {
                                drawable = new v2(chatActivityEnterView.getContext());
                                if (m6.I.q()) {
                                    G0 = -1;
                                } else {
                                    int i7 = m6.G6;
                                    int i10 = ChatActivityEnterView.f32569s7;
                                    G0 = chatActivityEnterView.G0(i7);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        rVar3.setStyleIcon(drawable);
                        oVar2.h.setReview(true);
                        oVar2.h.setBusy(true);
                        rfVar.f(obj, oVar2.H, new g(oVar2, 0));
                        g0.h3(oVar2.I, 400L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
