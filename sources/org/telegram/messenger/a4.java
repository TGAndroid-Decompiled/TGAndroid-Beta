package org.telegram.messenger;
public final class a4 implements Runnable {
    public final int f19587a;
    public final FileUploadOperation f19588b;
    public final int[] f19589c;

    public a4(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.f19587a = i10;
        this.f19588b = fileUploadOperation;
        this.f19589c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19587a) {
            case 0:
                FileUploadOperation.j(this.f19588b, this.f19589c);
                return;
            default:
                FileUploadOperation.i(this.f19588b, this.f19589c);
                return;
        }
    }
}
