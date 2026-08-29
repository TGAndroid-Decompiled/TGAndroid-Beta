package j3;
public abstract class e implements h2, d2 {
    private i2 configuration;
    private int index;
    private long lastResetPositionUs;
    private k3.k playerId;
    private int state;
    private l4.c1 stream;
    private t0[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final u0 formatHolder = new Object();
    private long readingPositionUs = Long.MIN_VALUE;

    public e(int i10) {
        this.trackType = i10;
    }

    public final n createRendererException(Throwable th2, t0 t0Var, int i10) {
        return createRendererException(th2, t0Var, false, i10);
    }

    public final void disable() {
        boolean z10 = true;
        if (this.state != 1) {
            z10 = false;
        }
        f5.a.i(z10);
        u0 u0Var = this.formatHolder;
        u0Var.f10814a = null;
        u0Var.f10815b = null;
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    public final void enable(i2 i2Var, t0[] t0VarArr, l4.c1 c1Var, long j10, boolean z10, boolean z11, long j11, long j12) {
        boolean z12;
        if (this.state == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        f5.a.i(z12);
        this.configuration = i2Var;
        this.state = 1;
        onEnabled(z10, z11);
        replaceStream(t0VarArr, c1Var, j11, j12);
        this.streamIsFinal = false;
        this.lastResetPositionUs = j10;
        this.readingPositionUs = j10;
        onPositionReset(j10, z10);
    }

    public final i2 getConfiguration() {
        i2 i2Var = this.configuration;
        i2Var.getClass();
        return i2Var;
    }

    public final u0 getFormatHolder() {
        u0 u0Var = this.formatHolder;
        u0Var.f10814a = null;
        u0Var.f10815b = null;
        return u0Var;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    public f5.n getMediaClock() {
        return null;
    }

    @Override
    public abstract String getName();

    public final k3.k getPlayerId() {
        k3.k kVar = this.playerId;
        kVar.getClass();
        return kVar;
    }

    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    public final int getState() {
        return this.state;
    }

    public final l4.c1 getStream() {
        return this.stream;
    }

    public final t0[] getStreamFormats() {
        t0[] t0VarArr = this.streamFormats;
        t0VarArr.getClass();
        return t0VarArr;
    }

    @Override
    public final int getTrackType() {
        return this.trackType;
    }

    public final boolean hasReadStreamToEnd() {
        if (this.readingPositionUs == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void init(int i10, k3.k kVar) {
        this.index = i10;
        this.playerId = kVar;
    }

    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    public abstract boolean isEnded();

    public abstract boolean isReady();

    public final boolean isSourceReady() {
        if (hasReadStreamToEnd()) {
            return this.streamIsFinal;
        }
        l4.c1 c1Var = this.stream;
        c1Var.getClass();
        return c1Var.e();
    }

    public final void maybeThrowStreamError() {
        l4.c1 c1Var = this.stream;
        c1Var.getClass();
        c1Var.a();
    }

    public abstract void onDisabled();

    public abstract void onPositionReset(long j10, boolean z10);

    public abstract void onStreamChanged(t0[] t0VarArr, long j10, long j11);

    public final int readSource(u0 u0Var, m3.i iVar, int i10) {
        l4.c1 c1Var = this.stream;
        c1Var.getClass();
        int d = c1Var.d(u0Var, iVar, i10);
        if (d == -4) {
            if (iVar.isEndOfStream()) {
                this.readingPositionUs = Long.MIN_VALUE;
                if (this.streamIsFinal) {
                    return -4;
                }
                return -3;
            }
            long j10 = iVar.d + this.streamOffsetUs;
            iVar.d = j10;
            this.readingPositionUs = Math.max(this.readingPositionUs, j10);
            return d;
        }
        if (d == -5) {
            t0 t0Var = u0Var.f10815b;
            t0Var.getClass();
            long j11 = t0Var.F;
            if (j11 != Long.MAX_VALUE) {
                s0 a2 = t0Var.a();
                a2.f10746s = j11 + this.streamOffsetUs;
                u0Var.f10815b = new t0(a2);
            }
        }
        return d;
    }

    public abstract void render(long j10, long j11);

    public final void replaceStream(t0[] t0VarArr, l4.c1 c1Var, long j10, long j11) {
        f5.a.i(!this.streamIsFinal);
        this.stream = c1Var;
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j10;
        }
        this.streamFormats = t0VarArr;
        this.streamOffsetUs = j11;
        onStreamChanged(t0VarArr, j10, j11);
    }

    public final void reset() {
        boolean z10;
        if (this.state == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        u0 u0Var = this.formatHolder;
        u0Var.f10814a = null;
        u0Var.f10815b = null;
        onReset();
    }

    public final void resetPosition(long j10) {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j10;
        this.readingPositionUs = j10;
        onPositionReset(j10, false);
    }

    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    public int skipSource(long j10) {
        l4.c1 c1Var = this.stream;
        c1Var.getClass();
        return c1Var.i(j10 - this.streamOffsetUs);
    }

    public final void start() {
        boolean z10 = true;
        if (this.state != 1) {
            z10 = false;
        }
        f5.a.i(z10);
        this.state = 2;
        onStarted();
    }

    public final void stop() {
        boolean z10;
        if (this.state == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        this.state = 1;
        onStopped();
    }

    @Override
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    public final j3.n createRendererException(java.lang.Throwable r11, j3.t0 r12, boolean r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: j3.e.createRendererException(java.lang.Throwable, j3.t0, boolean, int):j3.n");
    }

    public final h2 getCapabilities() {
        return this;
    }

    public void onReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    public void handleMessage(int i10, Object obj) {
    }

    public void onEnabled(boolean z10, boolean z11) {
    }

    public void setPlaybackSpeed(float f9, float f10) {
    }
}
