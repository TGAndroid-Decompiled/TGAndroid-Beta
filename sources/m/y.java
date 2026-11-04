package m;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.telegram.ui.Components.i9;
public class y {
    public static final int[] d = {16843067, 16843068};
    public final int f18783a = 2;
    public View f18784b;
    public Object f18785c;

    public y() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((mi.h0) ((i9) this.f18785c).f34636b).getClass();
            if (keyListener instanceof s1.e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new s1.e(keyListener);
        }
        return keyListener;
    }

    public void b(AttributeSet attributeSet, int i3) {
        boolean z10 = true;
        switch (this.f18783a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f18784b;
                k4.j F = k4.j.F(absSeekBar.getContext(), attributeSet, d, i3);
                Drawable B = F.B(0);
                if (B != null) {
                    if (B instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) B;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable e10 = e(animationDrawable.getFrame(i10), true);
                            e10.setLevel(10000);
                            animationDrawable2.addFrame(e10, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        B = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(B);
                }
                Drawable B2 = F.B(1);
                if (B2 != null) {
                    absSeekBar.setProgressDrawable(e(B2, false));
                }
                F.H();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f18784b).getContext().obtainStyledAttributes(attributeSet, f.a.f11313i, i3, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z10 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th2) {
                    obtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public s1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        i9 i9Var = (i9) this.f18785c;
        if (inputConnection == null) {
            i9Var.getClass();
            inputConnection = null;
        } else {
            mi.h0 h0Var = (mi.h0) i9Var.f34636b;
            h0Var.getClass();
            if (!(inputConnection instanceof s1.b)) {
                inputConnection = new s1.b((EditText) h0Var.f19644b, inputConnection, editorInfo);
            }
        }
        return (s1.b) inputConnection;
    }

    public void d(boolean z10) {
        s1.i iVar = (s1.i) ((mi.h0) ((i9) this.f18785c).f34636b).f19645c;
        if (iVar.f54590c != z10) {
            if (iVar.f54589b != null) {
                androidx.emoji2.text.l a10 = androidx.emoji2.text.l.a();
                s1.h hVar = iVar.f54589b;
                a10.getClass();
                com.google.android.gms.internal.play_billing.s1.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f1733a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f1734b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f54590c = z10;
            if (z10) {
                s1.i.a(iVar.f54588a, androidx.emoji2.text.l.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z10) {
        boolean z11;
        if (drawable instanceof j0.b) {
            ((j0.c) ((j0.b) drawable)).getClass();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                int id2 = layerDrawable.getId(i3);
                Drawable drawable2 = layerDrawable.getDrawable(i3);
                if (id2 != 16908301 && id2 != 16908303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                drawableArr[i3] = e(drawable2, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                layerDrawable2.setId(i10, layerDrawable.getId(i10));
                layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f18785c) == null) {
                this.f18785c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z10) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public y(AbsSeekBar absSeekBar) {
        this.f18784b = absSeekBar;
    }

    public y(EditText editText) {
        this.f18784b = editText;
        this.f18785c = new i9(editText);
    }
}
