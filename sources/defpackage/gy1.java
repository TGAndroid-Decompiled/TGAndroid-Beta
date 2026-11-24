package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.PhotoViewer;
public abstract class gy1 extends gt3 {
    public ra1 e2;
    public final ChatActivityEnterView f2;

    public gy1(ChatActivityEnterView chatActivityEnterView, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.f2 = chatActivityEnterView;
    }

    @Override
    public final void E() {
        hy1 hy1Var = this.f2.P3;
        if (hy1Var != null) {
            hy1Var.e1();
        }
    }

    @Override
    public final void F() {
        hy1 hy1Var = this.f2.P3;
        if (hy1Var != null) {
            hy1Var.e();
        }
    }

    public final void J(Uri uri, String str) {
        boolean z;
        mu1 mu1Var = this.f2.F3;
        if (mu1Var != null && mu1Var.y()) {
            z = true;
        } else {
            z = false;
        }
        Utilities.e.c(new jn1(this, uri, gl.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z), (byte) 9));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (mu1Var != null && mu1Var.getParentActivity() != null) {
            jm6 jm6Var = (jm6) arrayList.get(0);
            if (chatActivityEnterView.p3) {
                gl.t1(this);
                gl.d3(new ey1(this, arrayList, file, (byte) 0), 100L);
                return;
            }
            PhotoViewer.r0().T1(null, mu1Var, chatActivityEnterView.L4);
            PhotoViewer.r0().o1(arrayList, 0, 2, false, new fy1(this, jm6Var, file), chatActivityEnterView.F3);
        }
    }

    public final void L(gi3 gi3Var, boolean z, int i, int i2) {
        k27 threadMessage;
        k27 threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        mu1 mu1Var = chatActivityEnterView.F3;
        j47 j47Var = chatActivityEnterView.M0;
        j1a j1aVar = null;
        if (j47Var != null) {
            j47Var.f(true);
            chatActivityEnterView.M0 = null;
        }
        bu1 bu1Var = chatActivityEnterView.L3;
        if (bu1Var != null && mu1Var != null && bu1Var.f) {
            mu1Var.ic();
            return;
        }
        fo5 fo5Var = (fo5) gi3Var.a;
        boolean hasMimeType = fo5Var.getDescription().hasMimeType("image/gif");
        j5 j5Var = chatActivityEnterView.S;
        if (hasMimeType) {
            Uri f = fo5Var.f();
            long j = chatActivityEnterView.G3;
            k27 k27Var = chatActivityEnterView.J3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            bu1 bu1Var2 = chatActivityEnterView.L3;
            if (mu1Var != null) {
                j1aVar = mu1Var.Q6();
            }
            z3a.S(j5Var, null, null, f, null, "image/gif", j, k27Var, threadMessage2, null, bu1Var2, z, gi3Var, j1aVar);
        } else {
            Uri f2 = fo5Var.f();
            long j2 = chatActivityEnterView.G3;
            k27 k27Var2 = chatActivityEnterView.J3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (mu1Var != null) {
                j1aVar = mu1Var.Q6();
            }
            z3a.X(j5Var, f2, j2, k27Var2, threadMessage, gi3Var, null, z, 0, j1aVar);
        }
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.u(null, true, i, i2, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy1.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final wjb getResourcesProvider() {
        return this.f2.L4;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (mu1Var != null) {
            mu1Var.extendActionMode(menu);
        } else {
            chatActivityEnterView.B0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i = ChatActivityEnterView.r7;
            if (chatActivityEnterView.R2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !chatActivityEnterView.o7) {
                au3.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
            } else {
                au3.b(editorInfo, null);
            }
            return ble.a(onCreateInputConnection, editorInfo, new rh1(this, (byte) 12));
        } catch (Throwable th) {
            fa4.g(th, true);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z = true;
        } else {
            z = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.f2;
        chatActivityEnterView.T = z;
        super.onMeasure(i, i2);
        if (chatActivityEnterView.T) {
            int lineCount = getLineCount();
            chatActivityEnterView.U = lineCount;
            if (lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z2 = true;
            } else {
                z2 = false;
            }
            chatActivityEnterView.S1(z2);
            if (chatActivityEnterView.U <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z3 = false;
            }
            chatActivityEnterView.Y1(z3);
        }
        chatActivityEnterView.T = false;
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        hy1 hy1Var = this.f2.P3;
        if (hy1Var != null) {
            hy1Var.B();
        }
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        boolean z;
        cs5 cs5Var;
        ex1 ex1Var;
        super.onSelectionChanged(i, i2);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.r();
        }
        ew1 ew1Var = chatActivityEnterView.R0;
        if (ew1Var != null) {
            if (chatActivityEnterView.F3 != null && (ex1Var = chatActivityEnterView.F0) != null && ex1Var.getSelectionEnd() != chatActivityEnterView.F0.getSelectionStart()) {
                z = true;
            } else {
                z = false;
            }
            if (ew1Var.x != z) {
                ew1Var.x = z;
                ew1Var.invalidate();
            }
            if (!z && (cs5Var = chatActivityEnterView.U6) != null) {
                cs5Var.u();
                chatActivityEnterView.U6 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f2;
            chatActivityEnterView.N2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.R2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.u4 && chatActivityEnterView.r4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.P0()) {
                ra1 ra1Var = this.e2;
                if (ra1Var == null) {
                    ra1Var = new ra1(this);
                    this.e2 = ra1Var;
                    ra1Var.h = new Runnable(this) {
                        public final gy1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r2;
                            gy1 gy1Var = this.b;
                            switch (b) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = gy1Var.f2;
                                    int i2 = ChatActivityEnterView.r7;
                                    chatActivityEnterView2.X1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = gy1Var.f2;
                                    chatActivityEnterView3.b4 = false;
                                    chatActivityEnterView3.i1();
                                    return;
                            }
                        }
                    };
                }
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                ra1Var.i = false;
                ra1Var.c = 0;
                ra1Var.a(rectF);
                return this.e2.b(motionEvent);
            } else if (chatActivityEnterView.Q0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.O1(0, false);
                    chatActivityEnterView.V0.s(false);
                    requestFocus();
                }
                if (gl.D) {
                    i = 0;
                } else {
                    i = 2;
                }
                chatActivityEnterView.W1(i, 0, true, true);
                if (chatActivityEnterView.p4) {
                    chatActivityEnterView.P1(false, true, false, true);
                    chatActivityEnterView.b4 = true;
                    gl.d3(new Runnable(this) {
                        public final gy1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r2;
                            gy1 gy1Var = this.b;
                            switch (b) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = gy1Var.f2;
                                    int i2 = ChatActivityEnterView.r7;
                                    chatActivityEnterView2.X1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = gy1Var.f2;
                                    chatActivityEnterView3.b4 = false;
                                    chatActivityEnterView3.i1();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.i1();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.P0()) {
            return false;
        }
        return super.requestFocus(i, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = gl.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f) {
        super.setOffsetY(f);
        cja cjaVar = this.f2.c2;
        if (cjaVar.getForeground() != null) {
            cjaVar.invalidateDrawable(cjaVar.getForeground());
        }
    }
}
