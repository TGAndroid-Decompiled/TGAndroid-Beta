package gh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.bo0;
public final class i3 implements org.telegram.ui.ActionBar.b2, ff.p, td.b, Utilities.Callback5, bo0, d5.k, t2.e, ok0, Utilities.Callback2Return, nk0, ih.d7, ih.g9, dh.q, r0.o {
    public final int f8277a;
    public final Object f8278b;

    public i3(i3.a aVar, j4.q qVar, j4.y yVar, IOException iOException, boolean z10) {
        this.f8277a = 15;
        this.f8278b = yVar;
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        View view = ((m5) this.f8278b).f8547b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).J();
        } else {
            view.invalidate();
        }
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int a2;
        ih.m9 m9Var = (ih.m9) this.f8278b;
        int i9 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m9Var.v.getLayoutParams();
        if (!m9Var.f11789c) {
            i9 = m1Var.d();
        }
        marginLayoutParams.topMargin = i9;
        if (m9Var.f11789c) {
            a2 = m1Var.f46929a.f(2).d;
        } else {
            a2 = m1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f10848a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f10850c;
        ih.a9 a9Var = m9Var.f11824s;
        if (a9Var != null) {
            a9Var.requestLayout();
        }
        ih.b9 b9Var = m9Var.v;
        if (b9Var != null) {
            b9Var.requestLayout();
        }
        return r0.m1.f46928b;
    }

    @Override
    public boolean a(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: gh.i3.a(int, android.view.View):boolean");
    }

    @Override
    public Object apply(Object obj) {
        ((android.support.v4.media.c) this.f8278b).getClass();
        String u10 = ha.f0.f10299b.u((ha.e0) obj);
        kotlin.jvm.internal.i.d(u10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(u10));
        byte[] bytes = u10.getBytes(fd.a.f6039a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void b(int i9) {
        switch (this.f8277a) {
            case 4:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f8278b;
                if (i9 == 1) {
                    callback2.run(Boolean.TRUE, null);
                    return;
                } else if (i9 != 3) {
                    callback2.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 5:
                bg.y0 y0Var = (bg.y0) this.f8278b;
                if (i9 == 1) {
                    y0Var.run(Boolean.TRUE, null);
                    return;
                } else if (i9 != 3) {
                    y0Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                fh.w5 w5Var = (fh.w5) this.f8278b;
                if (i9 == 1) {
                    w5Var.run(Boolean.TRUE, null);
                    return;
                } else if (i9 != 3) {
                    w5Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        long j10;
        long j11;
        int i10;
        int i11;
        int i12;
        ih.h2 h2Var = (ih.h2) this.f8278b;
        f1 f1Var = h2Var.f12276c;
        ArrayList arrayList = h2Var.f12281r;
        ih.v0 v0Var = ((ih.t0) view).f12146f;
        int i13 = h2Var.J;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            j10 = 0;
            if (i15 >= v0Var.f12224f.size()) {
                break;
            }
            ih.u0 u0Var = (ih.u0) v0Var.f12224f.get(i15);
            long j12 = u0Var.f12179g;
            if (j12 > 0 && currentTime - u0Var.d <= ih.u.b(i13, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(u0Var.f12174a));
            }
            i15++;
        }
        ih.f1 f1Var2 = h2Var.L;
        if (f1Var2 != null) {
            j10 = f1Var2.j();
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            ih.u0 u0Var2 = (ih.u0) arrayList.get(i16);
            if (!u0Var2.f12175b && u0Var2.f12177e && u0Var2.f12179g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(u0Var2.f12174a))) {
                    j11 = j10;
                    if (h2Var.f12283w != v0Var.f12221b || (i12 = h2Var.f12284x) == 0 || u0Var2.f12174a < i12) {
                        i10 = u0Var2.f12174a;
                        break;
                    }
                } else {
                    j11 = j10;
                }
                i17++;
            }
            i16++;
            j10 = j11;
        }
        j11 = j10;
        i10 = -1;
        if (i10 < 0) {
            int i18 = 0;
            while (true) {
                if (i14 < arrayList.size()) {
                    ih.u0 u0Var3 = (ih.u0) arrayList.get(i14);
                    if (u0Var3.f12175b || !u0Var3.f12177e || u0Var3.f12179g >= j11) {
                        if (hashSet.contains(Integer.valueOf(u0Var3.f12174a))) {
                            i11 = u0Var3.f12174a;
                            i17 = i18;
                            break;
                        }
                        i18++;
                    }
                    i14++;
                } else {
                    i17 = i18;
                    i11 = -1;
                    break;
                }
            }
        } else {
            i11 = i10;
        }
        if (i11 < 0) {
            return;
        }
        h2Var.f12283w = v0Var.f12221b;
        h2Var.f12284x = i11;
        h2Var.f12285y = true;
        f2.w0 itemAnimator = f1Var.getItemAnimator();
        f1Var.setItemAnimator(null);
        h2Var.d.i1(i17, f1Var.getHeight() / 2, true);
        h2Var.f12278e.m(i17);
        f1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public void d(boolean z10) {
        ih.f5 f5Var = (ih.f5) this.f8278b;
        if (f5Var != null) {
            f5Var.c();
        }
    }

    @Override
    public void e(dh.l lVar, float f10, float f11) {
        ih.c8 c8Var = (ih.c8) this.f8278b;
        ih.d8 d8Var = c8Var.v;
        if (!d8Var.f11339x) {
            lVar.f4627q = new ih.b8(c8Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(d8Var.getHeight(), 2.0d) + Math.pow(d8Var.getWidth(), 2.0d));
            ArrayList arrayList = c8Var.f11299i;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((dh.l) obj).j(f10, f11, sqrt, false);
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f8277a) {
            case 0:
                ((Utilities.Callback) this.f8278b).run(c2Var.g(i9, true, true));
                return;
            default:
                ((Runnable) this.f8278b).run();
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f8278b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void h(long j10) {
        ((x4) this.f8278b).h();
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8277a) {
            case 8:
                ((h3.a2) obj).onMediaMetadataChanged((h3.h1) this.f8278b);
                return;
            case 9:
                ((h3.a2) obj).onAudioAttributesChanged((j3.e) this.f8278b);
                return;
            case 10:
                ((h3.a2) obj).onCues((r4.c) this.f8278b);
                return;
            case 11:
                ((h3.a2) obj).onMediaMetadataChanged(((h3.h0) this.f8278b).f9440a.O);
                return;
            case 12:
                ((h3.a2) obj).onMetadata((z3.c) this.f8278b);
                return;
            case 13:
                ((h3.a2) obj).onDeviceInfoChanged((h3.m) this.f8278b);
                return;
            case 14:
            default:
                ((i3.b) obj).h((k3.f) this.f8278b);
                return;
            case 15:
                ((i3.b) obj).b((j4.y) this.f8278b);
                return;
            case 16:
                ((i3.b) obj).a((h3.v1) this.f8278b);
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        switch (this.f8277a) {
            case 19:
                Long l10 = (Long) obj;
                return ih.w0.a((ih.w0) this.f8278b, (Long) obj2);
            default:
                uq0 uq0Var = (uq0) this.f8278b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new jh.t(uq0Var.f14378a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new bg.i(uq0Var, 21)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    public i3(i3.a aVar, Object obj, int i9) {
        this.f8277a = i9;
        this.f8278b = obj;
    }

    public i3(Object obj, int i9) {
        this.f8277a = i9;
        this.f8278b = obj;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f8277a) {
            case 3:
                v7.b((v7) this.f8278b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                la laVar = (la) this.f8278b;
                l41 l41Var = (l41) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                laVar.getClass();
                if (l41Var.G instanceof TL_stars.StarsTransaction) {
                    oa.h1(laVar.getContext(), false, 0L, laVar.f8517c, (TL_stars.StarsTransaction) l41Var.G, laVar.f8516b);
                    return;
                }
                return;
        }
    }

    @Override
    public void B(float f10, int i9) {
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
