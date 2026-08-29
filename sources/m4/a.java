package m4;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import i9.e2;
import j3.f;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import nh.n3;
import o3.k;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.ur;
import sg.g;
import v2.e;
public final class a implements f, e, GenericProvider, Utilities.Callback2Return, b2, kv0, g, yk0, yu0, zu0, LanguageDetector.ExceptionCallback {
    public final int f16836a;

    public a(int i10) {
        this.f16836a = i10;
    }

    public static ActionMode.Callback2 i(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    public Constructor a() {
        switch (this.f16836a) {
            case 7:
                if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(k.class).getConstructor(null);
        }
    }

    @Override
    public Object apply(Object obj) {
        m9.a.f16929b.getClass();
        return j9.a.f11292a.y((e2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public void b(Object obj, float f9) {
        ur urVar = (ur) obj;
        switch (this.f16836a) {
            case 21:
                urVar.f43317b = f9;
                if (urVar.getParent() != null) {
                    ((View) urVar.getParent()).invalidate();
                    return;
                }
                return;
            case 22:
            case 24:
            default:
                urVar.f43319e = f9;
                if (urVar.getParent() != null) {
                    ((View) urVar.getParent()).invalidate();
                    return;
                }
                return;
            case 23:
                urVar.f43318c = f9;
                if (urVar.getParent() != null) {
                    ((View) urVar.getParent()).invalidate();
                    return;
                }
                return;
            case 25:
                urVar.d = f9;
                if (urVar.getParent() != null) {
                    ((View) urVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public j3.g c(Bundle bundle) {
        Uri[] uriArr;
        long j10 = bundle.getLong(b.f16837r);
        int i10 = bundle.getInt(b.f16838s);
        int i11 = bundle.getInt(b.B);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b.v);
        int[] intArray = bundle.getIntArray(b.f16839w);
        long[] longArray = bundle.getLongArray(b.f16840x);
        long j11 = bundle.getLong(b.f16841y);
        boolean z10 = bundle.getBoolean(b.A);
        int[] iArr = intArray;
        if (iArr == null) {
            iArr = new int[0];
        }
        if (parcelableArrayList == null) {
            uriArr = new Uri[0];
        } else {
            uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
        }
        if (longArray == null) {
            longArray = new long[0];
        }
        long[] jArr = longArray;
        return new b(j10, i10, i11, iArr, uriArr, jArr, j11, z10);
    }

    @Override
    public void d(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f16836a) {
            case 10:
                c2Var.dismiss();
                return;
            case 15:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        ur urVar = (ur) obj;
        switch (this.f16836a) {
            case 20:
                return urVar.f43317b;
            case 21:
            case 23:
            default:
                return urVar.f43319e;
            case 22:
                return urVar.f43318c;
            case 24:
                return urVar.d;
        }
    }

    @Override
    public void h(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
        } else if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        MediaController.AlbumEntry albumEntry = n3.f18166f0;
        return 0;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f16836a) {
            case 28:
                FileLog.e(exc);
                return;
            default:
                FileLog.e(exc);
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f16836a) {
            case 6:
                if (num.intValue() == 0) {
                    return num2.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
            case 13:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public void m() {
    }
}
