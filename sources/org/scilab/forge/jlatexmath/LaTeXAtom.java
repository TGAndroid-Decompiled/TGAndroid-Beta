package org.scilab.forge.jlatexmath;

import java.util.Map;

public class LaTeXAtom extends Atom {
    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        teXEnvironmentCopy.getTeXFont().setRoman(true);
        float scaleFactor = teXEnvironmentCopy.getTeXFont().getScaleFactor();
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
        HorizontalBox horizontalBox = new HorizontalBox(rowAtom.getLastAtom().createBox(teXEnvironmentCopy));
        horizontalBox.add(new SpaceAtom(0, (-0.35f) * scaleFactor, 0.0f, 0.0f).createBox(teXEnvironmentCopy));
        float width = new SpaceAtom(1, 0.45f * scaleFactor, 0.0f, 0.0f).createBox(teXEnvironmentCopy).getWidth();
        float width2 = new SpaceAtom(1, 0.5f * scaleFactor, 0.0f, 0.0f).createBox(teXEnvironmentCopy).getWidth();
        CharBox charBox = new CharBox(teXEnvironmentCopy.getTeXFont().getChar('A', "mathnormal", teXEnvironmentCopy.supStyle().getStyle()));
        charBox.setShift(-width);
        horizontalBox.add(charBox);
        float f = scaleFactor * (-0.15f);
        horizontalBox.add(new SpaceAtom(0, f, 0.0f, 0.0f).createBox(teXEnvironmentCopy));
        horizontalBox.add(rowAtom.getLastAtom().createBox(teXEnvironmentCopy));
        horizontalBox.add(new SpaceAtom(0, f, 0.0f, 0.0f).createBox(teXEnvironmentCopy));
        Box boxCreateBox = rowAtom.getLastAtom().createBox(teXEnvironmentCopy);
        boxCreateBox.setShift(width2);
        horizontalBox.add(boxCreateBox);
        horizontalBox.add(new SpaceAtom(0, f, 0.0f, 0.0f).createBox(teXEnvironmentCopy));
        horizontalBox.add(rowAtom.getLastAtom().createBox(teXEnvironmentCopy));
        return horizontalBox;
    }
}
