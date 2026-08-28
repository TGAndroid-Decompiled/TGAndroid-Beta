package org.scilab.forge.jlatexmath;

import java.util.ArrayList;
public class LongdivAtom extends VRowAtom {
    public LongdivAtom(long j10, long j11) {
        setHalign(1);
        setVtop(true);
        String[] makeResults = makeResults(j10, j11);
        RuleAtom ruleAtom = new RuleAtom(1, 0.0f, 1, 2.6f, 1, 0.5f);
        for (int i9 = 0; i9 < makeResults.length; i9++) {
            Atom atom = new TeXFormula(makeResults[i9]).root;
            if (i9 % 2 == 0) {
                RowAtom rowAtom = new RowAtom(atom);
                rowAtom.add(ruleAtom);
                if (i9 == 0) {
                    append(rowAtom);
                } else {
                    append(new UnderlinedAtom(rowAtom));
                }
            } else if (i9 == 1) {
                String l10 = Long.toString(j10);
                BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom(SymbolAtom.get(TeXFormula.symbolMappings[41]), 1);
                RowAtom rowAtom2 = new RowAtom(new PhantomAtom(bigDelimiterAtom, false, true, true));
                rowAtom2.add(new SmashedAtom(new RaiseAtom(bigDelimiterAtom, 13, 3.5f, 13, 0.0f, 13, 0.0f)));
                rowAtom2.add(atom);
                OverlinedAtom overlinedAtom = new OverlinedAtom(rowAtom2);
                RowAtom rowAtom3 = new RowAtom(new TeXFormula(l10).root);
                rowAtom3.add(new SpaceAtom(1));
                rowAtom3.add(overlinedAtom);
                append(rowAtom3);
            } else {
                RowAtom rowAtom4 = new RowAtom(atom);
                rowAtom4.add(ruleAtom);
                append(rowAtom4);
            }
        }
    }

    private String[] makeResults(long j10, long j11) {
        ArrayList arrayList = new ArrayList();
        long j12 = j11 / j10;
        arrayList.add(Long.toString(j12));
        arrayList.add(Long.toString(j11));
        String l10 = Long.toString(j12);
        int length = l10.length();
        for (int i9 = 0; i9 < length; i9++) {
            long charAt = (l10.charAt(i9) - '0') * ((long) Math.pow(10.0d, (length - i9) - 1)) * j10;
            j11 -= charAt;
            arrayList.add(Long.toString(charAt));
            arrayList.add(Long.toString(j11));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
