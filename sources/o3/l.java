package o3;
public interface l extends com.google.android.exoplayer2.upstream.j {
    void a(int i10, int i11, byte[] bArr);

    boolean c(byte[] bArr, int i10, int i11, boolean z10);

    int d(int i10, int i11, byte[] bArr);

    boolean f(byte[] bArr, int i10, int i11, boolean z10);

    long getLength();

    long getPosition();

    long h();

    void i(int i10);

    void readFully(byte[] bArr, int i10, int i11);

    void s();

    int skip(int i10);

    void t(int i10);
}
