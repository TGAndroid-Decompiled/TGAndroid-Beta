package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.s51;
public final class a0 extends b0 implements org.telegram.ui.ActionBar.a6, r9, n0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public int E;
    public final int F;
    public final int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public StaticLayout L;
    public StaticLayout M;
    public String N;
    public t3 O;
    public MessageObject P;
    public TLRPC.Document Q;
    public int R;
    public boolean S;
    public boolean T;
    public final m0 U;
    public final int f9437n;
    public final org.telegram.ui.ActionBar.f6 f9438r;
    public final Paint f9439s;
    public final TextPaint v;
    public final RadialProgress2 f9440w;
    public final ko0 f9441x;
    public final int f9442y;

    public a0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f9439s = new Paint(1);
        this.v = new TextPaint(1);
        this.E = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.F = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.G = dp2;
        this.f9437n = i10;
        this.f9438r = f6Var;
        setWillNotDraw(false);
        this.f9442y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.f9440w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.E;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        ko0 ko0Var = new ko0(this);
        this.f9441x = ko0Var;
        ko0Var.h = new ce.m(this);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        m0 m0Var = new m0(context, f6Var, new xa.c(this, 23));
        this.U = m0Var;
        addView(m0Var.f9738a, w7.a6.e(-2, -2, 51));
        e();
    }

    private TLRPC.Document getDisplayDocument() {
        v vVar;
        a aVar = this.f9464a;
        if (aVar != null && (vVar = aVar.f9424g) != null) {
            TLRPC.Document document = vVar.h;
            if (document != null) {
                return document;
            }
            return vVar.f9899i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (k()) {
            return 3;
        }
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.U.f(i10, i11);
    }

    @Override
    public final void b() {
        this.U.i();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.P;
        if (messageObject != null && i11 == this.f9437n) {
            if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (i10 == NotificationCenter.messagePlayingProgressDidChanged && messageObject.getId() == ((Integer) objArr[0]).intValue() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    MessageObject messageObject2 = this.P;
                    messageObject2.audioProgress = playingMessageObject.audioProgress;
                    messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                    messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                    n();
                    return;
                }
                return;
            }
            m(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.U.c(canvas);
    }

    @Override
    public final void e() {
        this.f9439s.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18245uf, this.f9438r));
        m0 m0Var = this.U;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.H) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.E = i11;
        int i12 = this.G;
        int i13 = this.F;
        this.f9440w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    @Override
    public k1 getCaptionEditText() {
        return this.U.f9738a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.f9442y;
    }

    @Override
    public a getRow() {
        return this.f9464a;
    }

    public final TLRPC.TL_documentAttributeAudio h() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i10 = 0; i10 < displayDocument.attributes.size(); i10++) {
            if (displayDocument.attributes.get(i10) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i10);
            }
        }
        return null;
    }

    public final void i(a aVar, t3 t3Var) {
        v vVar;
        this.f9464a = aVar;
        this.O = t3Var;
        if (aVar != null && aVar.f9424g == null) {
            aVar.f9424g = new v();
        }
        this.H = LocaleController.isRTL;
        c(aVar);
        this.U.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.Q) {
            this.Q = displayDocument;
            this.P = null;
            this.N = null;
            this.M = null;
        }
        if (j() && this.P == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f17216id = -Long.valueOf(displayDocument.f17201id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.f9437n;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            peer.user_id = clientUserId;
            tL_peerUser.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.f9464a;
            if (aVar2 != null && (vVar = aVar2.f9424g) != null && !TextUtils.isEmpty(vVar.e)) {
                tL_message.attachPath = this.f9464a.f9424g.e;
            }
            this.P = new MessageObject(i10, tL_message, false, true);
        }
        l();
        if (this.T) {
            m(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean j() {
        v vVar;
        a aVar = this.f9464a;
        if (aVar != null && (vVar = aVar.f9424g) != null && vVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        v vVar;
        a aVar = this.f9464a;
        if (aVar != null && (vVar = aVar.f9424g) != null && vVar.a()) {
            return true;
        }
        return false;
    }

    public final void l() {
        int i10;
        int i11;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        int dp = AndroidUtilities.dp(50.0f) + this.E;
        int i12 = this.G;
        this.I = dp + i12;
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = AndroidUtilities.displaySize.x;
        }
        if (this.H) {
            i11 = this.f9466c;
        } else {
            i11 = 0;
        }
        this.K = Math.max(0, ((i10 - this.I) - AndroidUtilities.dp(16.0f)) - i11);
        MessageObject messageObject = this.P;
        if (messageObject != null) {
            str = messageObject.getMusicAuthor(false);
        } else if (h() != null) {
            str = h().performer;
        } else {
            str = null;
        }
        MessageObject messageObject2 = this.P;
        if (messageObject2 != null) {
            str2 = messageObject2.getMusicTitle(false);
        } else if (h() != null) {
            str2 = h().title;
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i13 = this.F;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.L = null;
            this.J = ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a4.a.C(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.L = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = AndroidUtilities.dp(11.0f) + ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        }
        this.f9441x.j(this.K, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        File pathToAttach;
        boolean z12;
        v vVar;
        int i10 = org.telegram.ui.ActionBar.j6.f18025ie;
        int i11 = org.telegram.ui.ActionBar.j6.f18043je;
        int i12 = org.telegram.ui.ActionBar.j6.f18242uc;
        int i13 = org.telegram.ui.ActionBar.j6.f18259vc;
        RadialProgress2 radialProgress2 = this.f9440w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bd, this.f9438r);
        boolean k10 = k();
        int i14 = this.f9437n;
        if (k10) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.f9464a.f9424g.f9897f, z10);
            radialProgress2.setIcon(3, false, z10);
            n();
            return;
        }
        if (j()) {
            document = this.f9464a.f9424g.h;
        } else {
            document = null;
        }
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.f9464a;
        int i15 = 1;
        if (aVar != null && (vVar = aVar.f9424g) != null && !TextUtils.isEmpty(vVar.e) && new File(this.f9464a.f9424g.e).exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (document == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i14).getPathToAttach(document, true);
        }
        if (!z11 && (pathToAttach == null || !pathToAttach.exists())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            this.R = (!MediaController.getInstance().isPlayingMessage(this.P) || MediaController.getInstance().isMessagePaused()) ? 0 : 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i14).addLoadingFileObserver(attachFileName, null, this);
            boolean isLoadingFile = FileLoader.getInstance(i14).isLoadingFile(attachFileName);
            float f7 = 0.0f;
            if (!isLoadingFile) {
                this.R = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.R = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f7 = fileProgress.floatValue();
                }
                radialProgress2.o(f7, z10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        n();
    }

    public final void n() {
        double d;
        MessageObject messageObject;
        if (!k() && (messageObject = this.P) != null) {
            ko0 ko0Var = this.f9441x;
            if (!ko0Var.e) {
                ko0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i10 = (int) d;
            }
        } else if (this.P != null && MediaController.getInstance().isPlayingMessage(this.P)) {
            i10 = this.P.audioProgressSec;
        } else {
            TLRPC.TL_documentAttributeAudio h = h();
            if (h != null) {
                d = h.duration;
                i10 = (int) d;
            }
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.N;
        if (str == null || !str.equals(formatShortDuration)) {
            this.N = formatShortDuration;
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.M = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        this.f9440w.m(this);
        this.f9441x.f24782s = this;
        m(false);
        int i10 = this.f9437n;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int i10 = this.f9437n;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        s9 textSelectionHelper;
        int i10;
        if (getDisplayDocument() != null) {
            this.f9440w.draw(canvas);
            int i11 = org.telegram.ui.ActionBar.j6.f18243ud;
            org.telegram.ui.ActionBar.f6 f6Var = this.f9438r;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18260vd, f6Var);
            int i12 = org.telegram.ui.ActionBar.j6.f18295xd;
            int v04 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            int v05 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18277wd, f6Var);
            ko0 ko0Var = this.f9441x;
            ko0Var.h(v02, v03, v04, v05, v06);
            if (!k()) {
                canvas.save();
                canvas.translate(this.I, this.J);
                ko0Var.b(canvas);
                canvas.restore();
            }
            int v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18115nd, f6Var);
            TextPaint textPaint = this.v;
            textPaint.setColor(v07);
            if (this.M != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.E, AndroidUtilities.dp(6.0f) + this.J);
                this.M.draw(canvas);
                canvas.restore();
            }
            if (this.L != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.E, this.J - AndroidUtilities.dp(16.0f));
                this.L.draw(canvas);
                canvas.restore();
            }
            t3 t3Var = this.O;
            if (t3Var != null && (textSelectionHelper = t3Var.f9859a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f20047u0 && R <= textSelectionHelper.f20050x0) {
                    int i13 = 0;
                    if (this.H) {
                        i10 = 0;
                    } else {
                        i10 = this.f9466c;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + i10;
                    float dp2 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.H) {
                        i13 = this.f9466c;
                    }
                    canvas.drawRoundRect(dp, dp2, (width - i13) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f9439s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        m(true);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z11 = this.H;
        int i15 = 0;
        if (z11) {
            i14 = 0;
        } else {
            i14 = this.f9466c;
        }
        if (z11) {
            i15 = this.f9466c;
        }
        this.U.g(i14, i15, i12 - i10, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.H;
        int i13 = 0;
        if (z10) {
            i12 = 0;
        } else {
            i12 = this.f9466c;
        }
        if (z10) {
            i13 = this.f9466c;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.U.h(i12, i13, size));
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        float f7;
        if (j10 <= 0) {
            f7 = 0.0f;
        } else {
            f7 = ((float) j3) / ((float) j10);
        }
        this.f9440w.o(Math.min(1.0f, f7), true);
        if (this.R != 3) {
            m(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f9440w.o(1.0f, true);
        m(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (!k()) {
            if (this.f9441x.f(x10 - this.I, y3 - this.J, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i10 = this.E;
            if (x10 >= i10) {
                int i11 = this.G;
                if (x10 <= i10 + i11) {
                    int i12 = this.F;
                    if (y3 >= i12 && y3 <= i12 + i11) {
                        this.S = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.S) {
                this.S = false;
                playSoundEffect(0);
                if (k()) {
                    t3 t3Var = this.O;
                    if (t3Var != null) {
                        a aVar = this.f9464a;
                        z3 z3Var = t3Var.f9859a;
                        ArrayList arrayList = z3Var.f10008l3;
                        d5 d5Var = (d5) z3Var.Z3.remove(aVar.f9424g);
                        if (d5Var != null) {
                            d5Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            k2 k2Var = z3Var.J3;
                            if (k2Var != null) {
                                k2Var.d();
                            }
                            arrayList.remove(indexOf);
                            z3Var.Y2.N(true);
                            k2 k2Var2 = z3Var.J3;
                            if (k2Var2 != null) {
                                k2Var2.h();
                            }
                        }
                        z3Var.f10001h3.onContentChanged();
                    }
                } else if (this.P != null) {
                    if (j()) {
                        document = this.f9464a.f9424g.h;
                    } else {
                        document = null;
                    }
                    int i13 = this.R;
                    RadialProgress2 radialProgress2 = this.f9440w;
                    if (i13 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.P);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.P, 0L, false, null)) {
                            this.R = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i13 == 1) {
                        if (MediaController.getInstance().lambda$startAudioAgain$7(this.P)) {
                            this.R = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else {
                        int i14 = this.f9437n;
                        if (i13 == 2) {
                            radialProgress2.o(0.0f, false);
                            FileLoader.getInstance(i14).loadFile(document, this.P, 1, 1);
                            this.R = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i13 == 3) {
                            FileLoader.getInstance(i14).cancelLoadFile(document);
                            this.R = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.S = false;
        }
        if (this.S || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
