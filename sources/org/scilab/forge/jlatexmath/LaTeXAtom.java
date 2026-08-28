package org.scilab.forge.jlatexmath;

import java.lang.Character;
import java.util.Map;
import org.scilab.forge.jlatexmath.TeXFormula;
public class LaTeXAtom extends Atom {
    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment copy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        copy.getTeXFont().setRoman(true);
        float scaleFactor = copy.getTeXFont().getScaleFactor();
        Map<Character.UnicodeBlock, TeXFormula.FontInfos> map = TeXFormula.externalFontMap;
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.BASIC_LATIN;
        TeXFormula.FontInfos fontInfos = map.get(unicodeBlock);
        if (fontInfos != null) {
            TeXFormula.externalFontMap.put(unicodeBlock, null);
        }
        RowAtom rowAtom = (RowAtom) ((RomanAtom) new TeXFormula("\\mathrm{XETL}").root).base;
        if (fontInfos != null) {
            TeXFormula.externalFontMap.put(unicodeBlock, fontInfos);
        }
        HorizontalBox horizontalBox = new HorizontalBox(rowAtom.getLastAtom().createBox(copy));
        horizontalBox.add(new SpaceAtom(0, (-0.35f) * scaleFactor, 0.0f, 0.0f).createBox(copy));
        float width = new SpaceAtom(1, 0.45f * scaleFactor, 0.0f, 0.0f).createBox(copy).getWidth();
        float width2 = new SpaceAtom(1, 0.5f * scaleFactor, 0.0f, 0.0f).createBox(copy).getWidth();
        CharBox charBox = new CharBox(copy.getTeXFont().getChar('A', "mathnormal", copy.supStyle().getStyle()));
        charBox.setShift(-width);
        horizontalBox.add(charBox);
        float f10 = scaleFactor * (-0.15f);
        horizontalBox.add(new SpaceAtom(0, f10, 0.0f, 0.0f).createBox(copy));
        horizontalBox.add(rowAtom.getLastAtom().createBox(copy));
        horizontalBox.add(new SpaceAtom(0, f10, 0.0f, 0.0f).createBox(copy));
        Box createBox = rowAtom.getLastAtom().createBox(copy);
        createBox.setShift(width2);
        horizontalBox.add(createBox);
        horizontalBox.add(new SpaceAtom(0, f10, 0.0f, 0.0f).createBox(copy));
        horizontalBox.add(rowAtom.getLastAtom().createBox(copy));
        return horizontalBox;
    }
}
