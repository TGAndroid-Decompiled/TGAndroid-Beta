package org.telegram.messenger;

public final class f5 implements Runnable {

    public final int f20219a;

    public final ImageLoader.HttpImageTask f20220b;

    public f5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f20219a = i10;
        this.f20220b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f20219a) {
            case 0:
                this.f20220b.lambda$onCancelled$6();
                break;
            case 1:
                this.f20220b.lambda$onCancelled$8();
                break;
            case 2:
                this.f20220b.lambda$onPostExecute$5();
                break;
            default:
                this.f20220b.lambda$onCancelled$7();
                break;
        }
    }
}
