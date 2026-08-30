package m;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import k7.x7;
public final class s extends EditText implements r0.p, u0.k {
    public final m f13627a;
    public final x0 f13628b;
    public final y f13629c;
    public final u0.j d;
    public final y e;
    public r f13630f;

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968776);
        e3.a(context);
        d3.a(this, getContext());
        m mVar = new m(this);
        this.f13627a = mVar;
        mVar.d(attributeSet, 2130968776);
        x0 x0Var = new x0(this);
        this.f13628b = x0Var;
        x0Var.f(attributeSet, 2130968776);
        x0Var.b();
        y yVar = new y();
        yVar.f13692b = this;
        this.f13629c = yVar;
        this.d = new Object();
        y yVar2 = new y(this);
        this.e = yVar2;
        yVar2.b(attributeSet, 2130968776);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a2 = yVar2.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    private r getSuperCaller() {
        if (this.f13630f == null) {
            this.f13630f = new r(this);
        }
        return this.f13630f;
    }

    @Override
    public final r0.h a(r0.h hVar) {
        this.d.getClass();
        return u0.j.a(this, hVar);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f13627a;
        if (mVar != null) {
            mVar.a();
        }
        x0 x0Var = this.f13628b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f13627a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f13627a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13628b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13628b.e();
    }

    @Override
    public TextClassifier getTextClassifier() {
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f13629c) != null) {
            TextClassifier textClassifier = (TextClassifier) yVar.f13693c;
            if (textClassifier == null) {
                return r0.a((TextView) yVar.f13692b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f13628b.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        k7.l.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (e = r0.j0.e(this)) != null) {
            t0.b.b(editorInfo, e);
            onCreateInputConnection = t0.f.a(onCreateInputConnection, editorInfo, new rh.e(this, 2));
        }
        return this.e.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z4 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && r0.j0.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z4 = b0.a(dragEvent, this, activity);
            }
        }
        if (z4) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        r0.e eVar;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31 && r0.j0.e(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i12 >= 31) {
                    eVar = new r0.d(primaryClip, 1);
                } else {
                    r0.f fVar = new r0.f();
                    fVar.f43100b = primaryClip;
                    fVar.f43101c = 1;
                    eVar = fVar;
                }
                if (i10 == 16908322) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                eVar.c(i11);
                r0.j0.i(this, eVar.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f13627a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f13627a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f13628b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f13628b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.e.d(z4);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f13627a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f13627a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f13628b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f13628b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x0 x0Var = this.f13628b;
        if (x0Var != null) {
            x0Var.g(context, i10);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT < 28 && (yVar = this.f13629c) != null) {
            yVar.f13693c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return getEditableText();
    }
}
