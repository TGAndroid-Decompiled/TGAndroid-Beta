package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
public final class alc implements qac {
    public final byte a;
    public final glc b;

    public alc(glc glcVar, byte b) {
        this.a = b;
        this.b = glcVar;
    }

    @Override
    public final void a(Object obj) {
        jlc jlcVar;
        String str;
        int F0;
        byte b = this.a;
        glc glcVar = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                if (glcVar.c == 3 && (jlcVar = glcVar.h) != null) {
                    jlcVar.setBusy(false);
                    if (str2 != null && !str2.trim().isEmpty()) {
                        glcVar.n = str2;
                        glcVar.h.r(str2);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!glcVar.n.trim().isEmpty()) {
                    c cVar = glcVar.b;
                    String trim = glcVar.n.trim();
                    if (!trim.isEmpty() && glcVar.h != null) {
                        gm.r(glcVar.k0);
                        gm.r(glcVar.j0);
                        Drawable drawable = null;
                        if (zze.a == glcVar) {
                            zze.a = null;
                        }
                        vo3 vo3Var = glcVar.f;
                        if (vo3Var != null) {
                            vo3Var.c();
                            glcVar.f = null;
                        }
                        ln3 ln3Var = glcVar.d;
                        if (ln3Var != null) {
                            ln3Var.d();
                            glcVar.d = null;
                        }
                        glcVar.e = null;
                        glcVar.c = (byte) 3;
                        Log.d("VoiceLive", "review: voice paused, restyling " + trim.length() + " chars");
                        glcVar.h.setListening(false);
                        cVar.e();
                        if (glcVar.H == null) {
                            glcVar.H = trim;
                        }
                        jlc jlcVar2 = glcVar.h;
                        boolean z = obj instanceof vm3;
                        if (z) {
                            str = ((vm3) obj).a();
                        } else {
                            str = null;
                        }
                        jlcVar2.setStyleLabel(str);
                        jlc jlcVar3 = glcVar.h;
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        if (z) {
                            vm3 vm3Var = (vm3) obj;
                            long j = vm3Var.b;
                            if (j != 0) {
                                drawable = vm.m(chatActivityEnterView.R, j, null, 2);
                            } else if (vm3Var.d) {
                                drawable = new hd(chatActivityEnterView.getContext());
                                if (cmb.I.o()) {
                                    F0 = -1;
                                } else {
                                    int i = cmb.F6;
                                    int i2 = ChatActivityEnterView.z7;
                                    F0 = chatActivityEnterView.F0(i);
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(F0, PorterDuff.Mode.SRC_IN));
                            }
                        }
                        jlcVar3.setStyleIcon(drawable);
                        glcVar.h.setReview(true);
                        glcVar.h.setBusy(true);
                        cVar.f(obj, glcVar.H, new alc(glcVar, (byte) 0));
                        gm.d3(glcVar.I, 400L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
