package bi;

import a8.y6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import c8.yb;
import java.util.ArrayList;
import org.telegram.messenger.i20;
public final class g5 implements org.telegram.ui.ActionBar.q4, yb.a {
    public boolean f3552a;
    public Object f3553b;
    public Object f3554c;
    public Object d;
    public Object f3555e;

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public boolean b(org.telegram.ui.ActionBar.q0 q0Var, RectF rectF) {
        int L;
        float L2 = org.telegram.messenger.g0.L(6.0f);
        rectF.set(L2, L2, ((FrameLayout) this.f3553b).getWidth() - L, ((FrameLayout) this.f3553b).getHeight() - L);
        return true;
    }

    @Override
    public ArrayList c(ub.a aVar) {
        Bitmap createBitmap;
        if (((a8.z0) this.f3555e) == null) {
            zzb();
        }
        if (((a8.z0) this.f3555e) != null) {
            int i7 = aVar.f58000e;
            if (i7 != -1) {
                if (i7 != 17) {
                    if (i7 != 35) {
                        if (i7 != 842094169) {
                            throw new lb.a("Unsupported image format", 13);
                        }
                        q6.m.g(null);
                        throw null;
                    }
                    q6.m.g(null);
                    throw null;
                }
                q6.m.g(null);
                throw null;
            }
            Bitmap bitmap = aVar.f57997a;
            q6.m.g(bitmap);
            int i10 = aVar.d;
            int i11 = aVar.f57998b;
            int i12 = aVar.f57999c;
            if (i10 == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i10);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
            }
            try {
                a8.z0 z0Var = (a8.z0) this.f3555e;
                q6.m.g(z0Var);
                a7.b bVar = new a7.b(createBitmap);
                Parcel p12 = z0Var.p1();
                int i13 = a8.g0.f410a;
                p12.writeStrongBinder(bVar);
                p12.writeInt(1);
                int r10 = yb.r(p12, 20293);
                yb.q(p12, 2, 4);
                p12.writeInt(-1);
                yb.s(p12, r10);
                Parcel r12 = z0Var.r1(p12, 1);
                a8.y4[] y4VarArr = (a8.y4[]) r12.createTypedArray(a8.y4.CREATOR);
                r12.recycle();
                ArrayList arrayList = new ArrayList();
                for (a8.y4 y4Var : y4VarArr) {
                    arrayList.add(new wb.a(y4Var.f720c, y4Var.d, y4Var.f719b, y4Var.f718a));
                }
                return arrayList;
            } catch (RemoteException e10) {
                throw new lb.a("Failed to run legacy image labeler.", e10);
            }
        }
        throw new lb.a("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public fh.g g(org.telegram.ui.ActionBar.g5 g5Var) {
        a6 a6Var = (a6) this.f3555e;
        fh.g c10 = a6Var.getBaseSimpleGlass().d.c(g5Var, null, false);
        c10.p(a6Var.N);
        i20.r(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = ((a6) this.f3555e).N;
        return eVar.a(eVar.f13313e);
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return ((a6) this.f3555e).N;
    }

    @Override
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public gh.a getMenuGlassColorProvider() {
        return ((a6) this.f3555e).N;
    }

    @Override
    public View getMenuHostView() {
        return (FrameLayout) this.f3553b;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public org.telegram.ui.ActionBar.e6 getMenuResourcesProvider() {
        org.telegram.ui.ActionBar.e6 e6Var;
        e6Var = ((org.telegram.ui.ActionBar.e2) ((a6) this.f3555e)).resourceProvider;
        return e6Var;
    }

    @Override
    public int getMenuRise() {
        return org.telegram.messenger.g0.L(8.0f);
    }

    @Override
    public View getMenuView() {
        return (f5) this.f3554c;
    }

    @Override
    public org.telegram.ui.ActionBar.g5 getOpenMenuOverlay() {
        if (this.f3552a) {
            return (org.telegram.ui.ActionBar.g5) this.d;
        }
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.g5 g5Var, org.telegram.ui.ActionBar.q0 q0Var) {
        boolean z10;
        int i7 = 0;
        if (g5Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3552a = z10;
        FrameLayout frameLayout = (FrameLayout) this.f3553b;
        if (z10) {
            i7 = 4;
        }
        frameLayout.setVisibility(i7);
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = ((a6) this.f3555e).getBaseSimpleGlass().f56043e;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    @Override
    public void zzb() {
        IInterface aVar;
        String str = (String) this.d;
        Context context = (Context) this.f3553b;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (((a8.z0) this.f3555e) == null) {
            try {
                IBinder b10 = b7.f.c(context, b7.f.f2951b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i7 = a8.w2.f697b;
                if (b10 == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof a8.x3) {
                        aVar = (a8.x3) queryLocalInterface;
                    } else {
                        aVar = new a8.a(b10, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", 0);
                    }
                }
                a8.z0 x12 = ((a8.v1) aVar).x1(new a7.b(context), (y6) this.f3554c);
                this.f3555e = x12;
                if (x12 == null && !this.f3552a) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    pb.j.b(context);
                    this.f3552a = true;
                }
            } catch (RemoteException e10) {
                throw new lb.a("Failed to create legacy image labeler.", e10);
            } catch (b7.b e11) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.f3552a) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        pb.j.b(context);
                        this.f3552a = true;
                        return;
                    }
                    return;
                }
                throw new lb.a("Failed to load deprecated vision dynamite module.", e11);
            }
        }
    }

    @Override
    public void zzc() {
        a8.z0 z0Var = (a8.z0) this.f3555e;
        if (z0Var != null) {
            try {
                z0Var.t1(z0Var.p1(), 2);
            } catch (RemoteException e10) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e10);
            }
            this.f3555e = null;
        }
    }
}
