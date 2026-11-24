package defpackage;
public final class jpc implements Runnable {
    public final byte a;
    public final npc b;

    public jpc(npc npcVar, byte b) {
        this.a = b;
        this.b = npcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        npc npcVar = this.b;
        switch (b) {
            case 0:
                npcVar.i();
                return;
            default:
                Runnable runnable = npcVar.d0;
                npcVar.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
