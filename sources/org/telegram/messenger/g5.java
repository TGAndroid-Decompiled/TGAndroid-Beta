package org.telegram.messenger;

public final class g5 implements Runnable {

    public final int f20343a;

    public final ImageLoader.HttpImageTask f20344b;

    public final Boolean f20345c;

    public g5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f20343a = i10;
        this.f20344b = httpImageTask;
        this.f20345c = bool;
    }

    @Override
    public final void run() {
        switch (this.f20343a) {
            case 0:
                this.f20344b.lambda$onPostExecute$3(this.f20345c);
                break;
            default:
                this.f20344b.lambda$onPostExecute$4(this.f20345c);
                break;
        }
    }
}
