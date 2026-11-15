package ji;

import ai.c2;
import ai.z;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.messenger.g0;
import org.telegram.messenger.xr;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gf;
public final class h implements z10 {
    public final int f17550a;
    public final m f17551b;

    public h(m mVar, int i7) {
        this.f17550a = i7;
        this.f17551b = mVar;
    }

    @Override
    public final void a(Object obj) {
        p pVar;
        String str;
        int u02;
        switch (this.f17550a) {
            case 0:
                m mVar = this.f17551b;
                String str2 = (String) obj;
                if (mVar.f17573c == 3 && (pVar = mVar.h) != null) {
                    pVar.setBusy(false);
                    if (str2 != null && !str2.trim().isEmpty()) {
                        mVar.f17586n = str2;
                        mVar.h.r(str2);
                        return;
                    }
                    return;
                }
                return;
            default:
                m mVar2 = this.f17551b;
                if (!mVar2.f17586n.trim().isEmpty()) {
                    gf gfVar = mVar2.f17571b;
                    String trim = mVar2.f17586n.trim();
                    if (!trim.isEmpty() && mVar2.h != null) {
                        g0.r(mVar2.f17584k0);
                        g0.r(mVar2.f17583j0);
                        Drawable drawable = null;
                        if (xr.f27577k == mVar2) {
                            xr.f27577k = null;
                        }
                        c2 c2Var = mVar2.f17578f;
                        if (c2Var != null) {
                            c2Var.c();
                            mVar2.f17578f = null;
                        }
                        z zVar = mVar2.d;
                        if (zVar != null) {
                            zVar.d();
                            mVar2.d = null;
                        }
                        mVar2.f17576e = null;
                        mVar2.f17573c = 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        mVar2.h.setListening(false);
                        gfVar.e();
                        if (mVar2.H == null) {
                            mVar2.H = trim;
                        }
                        p pVar2 = mVar2.h;
                        boolean z10 = obj instanceof ai.h;
                        if (z10) {
                            str = ((ai.h) obj).f1216a;
                        } else {
                            str = null;
                        }
                        pVar2.setStyleLabel(str);
                        p pVar3 = mVar2.h;
                        ChatActivityEnterView chatActivityEnterView = gfVar.f34928a;
                        if (z10) {
                            ai.h hVar = (ai.h) obj;
                            long j3 = hVar.f1218c;
                            if (j3 != 0) {
                                drawable = g5.m(chatActivityEnterView.R, j3, null, 2);
                            } else if (hVar.f1219e) {
                                drawable = new t2(chatActivityEnterView.getContext());
                                if (j6.I.q()) {
                                    u02 = -1;
                                } else {
                                    int i7 = j6.G6;
                                    int i10 = ChatActivityEnterView.N6;
                                    u02 = chatActivityEnterView.u0(i7);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(u02, PorterDuff.Mode.SRC_IN));
                            } else {
                                String str3 = hVar.f1217b;
                                if (str3 != null) {
                                    drawable = org.telegram.messenger.j6.f(str3);
                                }
                            }
                        }
                        pVar3.setStyleIcon(drawable);
                        mVar2.h.setReview(true);
                        mVar2.h.setBusy(true);
                        gfVar.f(obj, mVar2.H, new h(mVar2, 0));
                        g0.i3(mVar2.I, 400L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
