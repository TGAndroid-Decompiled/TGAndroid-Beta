package defpackage;

import android.app.Notification;
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
import java.util.ArrayList;
public final class h31 implements h07, nbd {
    public static final m11 f = new Object();
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public h31(j74 j74Var, fm4 fm4Var, uob uobVar, eef eefVar, boolean z) {
        this.b = j74Var;
        this.c = fm4Var;
        this.d = uobVar;
        this.e = eefVar;
        this.a = z;
    }

    public static void i(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void b(zha zhaVar, r7 r7Var) {
        boolean z;
        int i = 0;
        if (zhaVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        FrameLayout frameLayout = (FrameLayout) this.b;
        if (z) {
            i = 4;
        }
        frameLayout.setVisibility(i);
    }

    @Override
    public final boolean c(r7 r7Var, RectF rectF) {
        int L;
        float L2 = gl.L(6.0f);
        rectF.set(L2, L2, ((FrameLayout) this.b).getWidth() - L, ((FrameLayout) this.b).getHeight() - L);
        return true;
    }

    @Override
    public final ArrayList d(go5 go5Var) {
        Bitmap createBitmap;
        if (((cnd) this.e) == null) {
            zzb();
        }
        if (((cnd) this.e) != null) {
            Bitmap bitmap = go5Var.a;
            fre.h(bitmap);
            int i = go5Var.d;
            int i2 = go5Var.b;
            int i3 = go5Var.c;
            if (i == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
            }
            try {
                cnd cndVar = (cnd) this.e;
                fre.h(cndVar);
                bo7 bo7Var = new bo7(createBitmap);
                Parcel R = cndVar.R();
                int i4 = vgd.a;
                R.writeStrongBinder(bo7Var);
                R.writeInt(1);
                int r = jte.r(R, 20293);
                jte.q(R, 2, 4);
                R.writeInt(-1);
                jte.s(R, r);
                Parcel T = cndVar.T(R, 1);
                dce[] dceVarArr = (dce[]) T.createTypedArray(dce.CREATOR);
                T.recycle();
                ArrayList arrayList = new ArrayList();
                for (dce dceVar : dceVarArr) {
                    arrayList.add(new fk5(dceVar.c, dceVar.d, dceVar.b, dceVar.a));
                }
                return arrayList;
            } catch (RemoteException e) {
                throw new be7("Failed to run legacy image labeler.", e);
            }
        }
        throw new be7("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        nl0 nl0Var = ((z99) this.e).N;
        return nl0Var.a(nl0Var.e);
    }

    @Override
    public final al0 getButtonsGlassColorProvider() {
        return ((z99) this.e).N;
    }

    @Override
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public final int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public final int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public final al0 getMenuGlassColorProvider() {
        return ((z99) this.e).N;
    }

    @Override
    public final View getMenuHostView() {
        return (FrameLayout) this.b;
    }

    @Override
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public final wjb getMenuResourcesProvider() {
        return z99.Y((z99) this.e);
    }

    @Override
    public final int getMenuRise() {
        return gl.L(8.0f);
    }

    @Override
    public final View getMenuView() {
        return (i99) this.c;
    }

    @Override
    public final zha getOpenMenuOverlay() {
        if (this.a) {
            return (zha) this.d;
        }
        return null;
    }

    @Override
    public final il0 h(zha zhaVar) {
        z99 z99Var = (z99) this.e;
        il0 c = z99Var.getBaseSimpleGlass().d.c(zhaVar, null, false);
        c.p(z99Var.N);
        ug8.r(c, gl.L(23.0f), 6.0f);
        return c;
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f2) {
        jx4 jx4Var = ((z99) this.e).getBaseSimpleGlass().e;
        if (jx4Var != null) {
            jx4Var.k(f2);
        }
    }

    @Override
    public final void zzb() {
        IInterface ezcVar;
        String str = (String) this.d;
        Context context = (Context) this.b;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (((cnd) this.e) == null) {
            try {
                IBinder b = ds3.c(context, ds3.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i = oyd.b;
                if (b == null) {
                    ezcVar = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof y5e) {
                        ezcVar = (y5e) queryLocalInterface;
                    } else {
                        ezcVar = new ezc(b, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", (byte) 7);
                    }
                }
                cnd Z = ((gtd) ezcVar).Z(new bo7(context), (qme) this.c);
                this.e = Z;
                if (Z == null && !this.a) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    uq7.a(context);
                    this.a = true;
                }
            } catch (RemoteException e) {
                throw new be7("Failed to create legacy image labeler.", e);
            } catch (as3 e2) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.a) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        uq7.a(context);
                        this.a = true;
                        return;
                    }
                    return;
                }
                throw new be7("Failed to load deprecated vision dynamite module.", e2);
            }
        }
    }

    @Override
    public final void zzc() {
        cnd cndVar = (cnd) this.e;
        if (cndVar != null) {
            try {
                cndVar.V(cndVar.R(), 2);
            } catch (RemoteException e) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e);
            }
            this.e = null;
        }
    }
}
