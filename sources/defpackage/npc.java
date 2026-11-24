package defpackage;
public final class npc {
    public final String a;
    public final boolean b;
    public final opc c;

    public npc(ppc ppcVar, String str, boolean z, opc opcVar) {
        this.a = str;
        this.b = z;
        this.c = new opc(ppcVar, opcVar, opcVar.a, true);
    }
}
