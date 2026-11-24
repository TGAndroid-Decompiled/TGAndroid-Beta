package defpackage;
public final class hpc implements it3 {
    public final byte a;
    public final npc b;

    public hpc(npc npcVar, byte b) {
        this.a = b;
        this.b = npcVar;
    }

    @Override
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        npc npcVar = this.b;
        switch (b) {
            case 0:
                npcVar.c.setScaleX(f);
                npcVar.c.setScaleY(f);
                return;
            default:
                npcVar.Q = f2;
                return;
        }
    }
}
