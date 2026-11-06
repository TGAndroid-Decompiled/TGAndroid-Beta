package org.scilab.forge.jlatexmath;

import java.util.ArrayList;
public class LongdivAtom extends VRowAtom {
    public LongdivAtom(long j3, long j10) {
        setHalign(1);
        setVtop(true);
        String[] makeResults = makeResults(j3, j10);
        RuleAtom ruleAtom = new RuleAtom(1, 0.0f, 1, 2.6f, 1, 0.5f);
        for (int i7 = 0; i7 < makeResults.length; i7++) {
            Atom atom = new TeXFormula(makeResults[i7]).root;
            if (i7 % 2 == 0) {
                RowAtom rowAtom = new RowAtom(atom);
                rowAtom.add(ruleAtom);
                if (i7 == 0) {
                    append(rowAtom);
                } else {
                    append(new UnderlinedAtom(rowAtom));
                }
            } else if (i7 == 1) {
                String l10 = Long.toString(j3);
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

    private String[] makeResults(long j3, long j10) {
        ArrayList arrayList = new ArrayList();
        long j11 = j10 / j3;
        arrayList.add(Long.toString(j11));
        arrayList.add(Long.toString(j10));
        String l10 = Long.toString(j11);
        int length = l10.length();
        for (int i7 = 0; i7 < length; i7++) {
            long charAt = (l10.charAt(i7) - '0') * ((long) Math.pow(10.0d, (length - i7) - 1)) * j3;
            j10 -= charAt;
            arrayList.add(Long.toString(charAt));
            arrayList.add(Long.toString(j10));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
