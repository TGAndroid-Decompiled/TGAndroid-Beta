package ji;

import ai.c2;
import ai.z;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.messenger.g0;
import org.telegram.messenger.vr;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pf;
public final class h implements x10 {
    public final int f17940a;
    public final m f17941b;

    public h(m mVar, int i7) {
        this.f17940a = i7;
        this.f17941b = mVar;
    }

    @Override
    public final void a(Object obj) {
        p pVar;
        String str;
        int C0;
        switch (this.f17940a) {
            case 0:
                m mVar = this.f17941b;
                String str2 = (String) obj;
                if (mVar.f17963c == 3 && (pVar = mVar.h) != null) {
                    pVar.setBusy(false);
                    if (str2 != null && !str2.trim().isEmpty()) {
                        mVar.f17976n = str2;
                        mVar.h.r(str2);
                        return;
                    }
                    return;
                }
                return;
            default:
                m mVar2 = this.f17941b;
                if (!mVar2.f17976n.trim().isEmpty()) {
                    pf pfVar = mVar2.f17961b;
                    String trim = mVar2.f17976n.trim();
                    if (!trim.isEmpty() && mVar2.h != null) {
                        g0.r(mVar2.f17974k0);
                        g0.r(mVar2.f17973j0);
                        Drawable drawable = null;
                        if (vr.f27591k == mVar2) {
                            vr.f27591k = null;
                        }
                        c2 c2Var = mVar2.f17968f;
                        if (c2Var != null) {
                            c2Var.c();
                            mVar2.f17968f = null;
                        }
                        z zVar = mVar2.d;
                        if (zVar != null) {
                            zVar.d();
                            mVar2.d = null;
                        }
                        mVar2.f17966e = null;
                        mVar2.f17963c = 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        mVar2.h.setListening(false);
                        pfVar.e();
                        if (mVar2.H == null) {
                            mVar2.H = trim;
                        }
                        p pVar2 = mVar2.h;
                        boolean z10 = obj instanceof ai.g;
                        if (z10) {
                            str = ((ai.g) obj).a();
                        } else {
                            str = null;
                        }
                        pVar2.setStyleLabel(str);
                        p pVar3 = mVar2.h;
                        ChatActivityEnterView chatActivityEnterView = pfVar.f38384a;
                        if (z10) {
                            ai.g gVar = (ai.g) obj;
                            long j3 = gVar.f1200b;
                            if (j3 != 0) {
                                drawable = o5.m(chatActivityEnterView.R, j3, null, 2);
                            } else if (gVar.d) {
                                drawable = new w2(chatActivityEnterView.getContext());
                                if (n6.I.q()) {
                                    C0 = -1;
                                } else {
                                    int i7 = n6.G6;
                                    int i10 = ChatActivityEnterView.f32538n7;
                                    C0 = chatActivityEnterView.C0(i7);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(C0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        pVar3.setStyleIcon(drawable);
                        mVar2.h.setReview(true);
                        mVar2.h.setBusy(true);
                        pfVar.f(obj, mVar2.H, new h(mVar2, 0));
                        g0.h3(mVar2.I, 400L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
