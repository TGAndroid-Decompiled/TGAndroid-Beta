package a9;

import ag.s0;
import android.graphics.Typeface;
import android.media.MediaRoute2Info;
import android.os.Bundle;
import android.util.Log;
import bg.u3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import l4.j1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
public final class f implements g, z9.a, e, s0, OnFailureListener, b2, Continuation, v2.e, j3.f {
    public final int f240a;

    public f(int i10) {
        this.f240a = i10;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public java.lang.Object I0(a5.j r45) {
        throw new UnsupportedOperationException("Method not decompiled: a9.f.I0(a5.j):java.lang.Object");
    }

    @Override
    public Typeface a() {
        switch (this.f240a) {
            case 3:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 4:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 5:
                return Typeface.create("serif", 1);
            case 6:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 7:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public Object apply(Object obj) {
        ga.e eVar = (ga.e) obj;
        eVar.getClass();
        v5.c cVar = com.google.firebase.messaging.o.f5180a;
        cVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cVar.e(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public j3.g c(Bundle bundle) {
        List aVar;
        Bundle bundle2 = bundle.getBundle(d5.v.f5380c);
        bundle2.getClass();
        j1 j1Var = (j1) j1.f14346n.c(bundle2);
        int[] intArray = bundle.getIntArray(d5.v.d);
        intArray.getClass();
        if (intArray.length == 0) {
            aVar = Collections.EMPTY_LIST;
        } else {
            aVar = new s8.a(0, intArray.length, intArray);
        }
        return new d5.v(j1Var, aVar);
    }

    @Override
    public List e(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f240a) {
            case 20:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void j(z9.b bVar) {
        switch (this.f240a) {
            case 1:
                return;
            case 18:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = u3.f2549n0;
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f240a) {
            case 23:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    public f(Object obj, int i10) {
        this.f240a = i10;
    }

    private final void b(z9.b bVar) {
    }
}
