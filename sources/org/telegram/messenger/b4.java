package org.telegram.messenger;
public final class b4 implements Runnable {
    public final int f19670a;
    public final FileUploadOperation f19671b;
    public final int[] f19672c;

    public b4(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19670a = i10;
        this.f19671b = fileUploadOperation;
        this.f19672c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19670a) {
            case 0:
                FileUploadOperation.j(this.f19671b, this.f19672c);
                return;
            default:
                FileUploadOperation.i(this.f19671b, this.f19672c);
                return;
        }
    }
}
