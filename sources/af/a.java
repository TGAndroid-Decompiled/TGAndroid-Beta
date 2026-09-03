package af;

import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import android.util.Log;
import cg.r0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.o;
import dg.q3;
import g5.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import s5.m;
public final class a implements l, c9.g, ba.a, c9.f, r0, Continuation, v2.e, OnFailureListener, c2 {
    public final int f149a;

    public a(int i10) {
        this.f149a = i10;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f149a) {
            case 9:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 10:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 11:
                return Typeface.create("serif", 1);
            case 12:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 13:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public Object apply(Object obj) {
        ia.e eVar = (ia.e) obj;
        eVar.getClass();
        m mVar = o.f4001a;
        mVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mVar.g(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public g5.m createDataSource() {
        return new g5.c(ApplicationLoader.applicationContext);
    }

    @Override
    public java.lang.Object d0(c5.j r45) {
        throw new UnsupportedOperationException("Method not decompiled: af.a.d0(c5.j):java.lang.Object");
    }

    @Override
    public void f(ba.b bVar) {
        switch (this.f149a) {
            case 7:
                return;
            default:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f149a) {
            case 28:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = q3.f4743o0;
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f149a) {
            case 16:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    public a(Object obj, int i10) {
        this.f149a = i10;
    }

    private final void c(ba.b bVar) {
    }
}
