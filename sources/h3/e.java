package h3;
public abstract class e implements h2, d2 {
    private i2 configuration;
    private int index;
    private long lastResetPositionUs;
    private i3.l playerId;
    private int state;
    private j4.b1 stream;
    private t0[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final u0 formatHolder = new Object();
    private long readingPositionUs = Long.MIN_VALUE;

    public e(int i9) {
        this.trackType = i9;
    }

    public final n createRendererException(Throwable th, t0 t0Var, int i9) {
        return createRendererException(th, t0Var, false, i9);
    }

    public final void disable() {
        boolean z10 = true;
        if (this.state != 1) {
            z10 = false;
        }
        d5.a.i(z10);
        u0 u0Var = this.formatHolder;
        u0Var.f9777a = null;
        u0Var.f9778b = null;
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    public final void enable(i2 i2Var, t0[] t0VarArr, j4.b1 b1Var, long j10, boolean z10, boolean z11, long j11, long j12) {
        boolean z12;
        if (this.state == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d5.a.i(z12);
        this.configuration = i2Var;
        this.state = 1;
        onEnabled(z10, z11);
        replaceStream(t0VarArr, b1Var, j11, j12);
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
        u0Var.f9777a = null;
        u0Var.f9778b = null;
        return u0Var;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    public d5.o getMediaClock() {
        return null;
    }

    @Override
    public abstract String getName();

    public final i3.l getPlayerId() {
        i3.l lVar = this.playerId;
        lVar.getClass();
        return lVar;
    }

    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    public final int getState() {
        return this.state;
    }

    public final j4.b1 getStream() {
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

    public final void init(int i9, i3.l lVar) {
        this.index = i9;
        this.playerId = lVar;
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
        j4.b1 b1Var = this.stream;
        b1Var.getClass();
        return b1Var.f();
    }

    public final void maybeThrowStreamError() {
        j4.b1 b1Var = this.stream;
        b1Var.getClass();
        b1Var.a();
    }

    public abstract void onDisabled();

    public abstract void onPositionReset(long j10, boolean z10);

    public abstract void onStreamChanged(t0[] t0VarArr, long j10, long j11);

    public final int readSource(u0 u0Var, k3.i iVar, int i9) {
        j4.b1 b1Var = this.stream;
        b1Var.getClass();
        int l10 = b1Var.l(u0Var, iVar, i9);
        if (l10 == -4) {
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
            return l10;
        }
        if (l10 == -5) {
            t0 t0Var = u0Var.f9778b;
            t0Var.getClass();
            long j11 = t0Var.F;
            if (j11 != Long.MAX_VALUE) {
                s0 a2 = t0Var.a();
                a2.f9709s = j11 + this.streamOffsetUs;
                u0Var.f9778b = new t0(a2);
            }
        }
        return l10;
    }

    public abstract void render(long j10, long j11);

    public final void replaceStream(t0[] t0VarArr, j4.b1 b1Var, long j10, long j11) {
        d5.a.i(!this.streamIsFinal);
        this.stream = b1Var;
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
        d5.a.i(z10);
        u0 u0Var = this.formatHolder;
        u0Var.f9777a = null;
        u0Var.f9778b = null;
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
        j4.b1 b1Var = this.stream;
        b1Var.getClass();
        return b1Var.j(j10 - this.streamOffsetUs);
    }

    public final void start() {
        boolean z10 = true;
        if (this.state != 1) {
            z10 = false;
        }
        d5.a.i(z10);
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
        d5.a.i(z10);
        this.state = 1;
        onStopped();
    }

    @Override
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    public final h3.n createRendererException(java.lang.Throwable r11, h3.t0 r12, boolean r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: h3.e.createRendererException(java.lang.Throwable, h3.t0, boolean, int):h3.n");
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

    public void handleMessage(int i9, Object obj) {
    }

    public void onEnabled(boolean z10, boolean z11) {
    }

    public void setPlaybackSpeed(float f10, float f11) {
    }
}
