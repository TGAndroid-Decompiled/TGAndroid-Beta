package org.scilab.forge.jlatexmath;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import ru.noties.jlatexmath.awt.Color;
public class ColorAtom extends Atom implements Row {
    public static Map<String, Color> Colors = new HashMap();
    private final Color background;
    private final Color color;
    private final RowAtom elements;

    static {
        initColors();
    }

    public ColorAtom(Atom atom, Color color, Color color2) {
        this.elements = new RowAtom(atom);
        this.background = color;
        this.color = color2;
    }

    private static Color convColor(float f9, float f10, float f11, float f12) {
        float f13 = 1.0f - f12;
        return new Color((1.0f - f9) * f13, (1.0f - f10) * f13, (1.0f - f11) * f13);
    }

    public static Color getColor(String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() >= 1) {
                if (trim.charAt(0) == '#') {
                    return Color.decode(trim);
                }
                if (trim.indexOf(44) != -1 || trim.indexOf(59) != -1) {
                    StringTokenizer stringTokenizer = new StringTokenizer(trim, ";,");
                    int countTokens = stringTokenizer.countTokens();
                    if (countTokens == 3) {
                        try {
                            String trim2 = stringTokenizer.nextToken().trim();
                            String trim3 = stringTokenizer.nextToken().trim();
                            String trim4 = stringTokenizer.nextToken().trim();
                            float parseFloat = Float.parseFloat(trim2);
                            float parseFloat2 = Float.parseFloat(trim3);
                            float parseFloat3 = Float.parseFloat(trim4);
                            if (parseFloat == ((int) parseFloat) && parseFloat2 == ((int) parseFloat2) && parseFloat3 == ((int) parseFloat3) && trim2.indexOf(46) == -1 && trim3.indexOf(46) == -1 && trim4.indexOf(46) == -1) {
                                return new Color((int) Math.min(255.0f, Math.max(0.0f, parseFloat)), (int) Math.min(255.0f, Math.max(0.0f, parseFloat2)), (int) Math.min(255.0f, Math.max(0.0f, parseFloat3)));
                            }
                            return new Color(Math.min(1.0f, Math.max(0.0f, parseFloat)), Math.min(1.0f, Math.max(0.0f, parseFloat2)), Math.min(1.0f, Math.max(0.0f, parseFloat3)));
                        } catch (NumberFormatException unused) {
                            return Color.black;
                        }
                    } else if (countTokens == 4) {
                        try {
                            return convColor(Math.min(1.0f, Math.max(0.0f, Float.parseFloat(stringTokenizer.nextToken().trim()))), Math.min(1.0f, Math.max(0.0f, Float.parseFloat(stringTokenizer.nextToken().trim()))), Math.min(1.0f, Math.max(0.0f, Float.parseFloat(stringTokenizer.nextToken().trim()))), Math.min(1.0f, Math.max(0.0f, Float.parseFloat(stringTokenizer.nextToken().trim()))));
                        } catch (NumberFormatException unused2) {
                            return Color.black;
                        }
                    }
                }
                Color color = Colors.get(trim.toLowerCase());
                if (color != null) {
                    return color;
                }
                if (trim.indexOf(46) != -1) {
                    try {
                        float min = Math.min(1.0f, Math.max(Float.parseFloat(trim), 0.0f));
                        return new Color(min, min, min);
                    } catch (NumberFormatException unused3) {
                    }
                }
                return Color.decode("#".concat(trim));
            }
        }
        return Color.black;
    }

    private static void initColors() {
        Colors.put("black", Color.black);
        Colors.put("white", Color.white);
        Colors.put("red", Color.red);
        Colors.put("green", Color.green);
        Colors.put("blue", Color.blue);
        Colors.put("cyan", Color.cyan);
        Colors.put("magenta", Color.magenta);
        Colors.put("yellow", Color.yellow);
        Colors.put("greenyellow", convColor(0.15f, 0.0f, 0.69f, 0.0f));
        Colors.put("goldenrod", convColor(0.0f, 0.1f, 0.84f, 0.0f));
        Colors.put("dandelion", convColor(0.0f, 0.29f, 0.84f, 0.0f));
        Colors.put("apricot", convColor(0.0f, 0.32f, 0.52f, 0.0f));
        Colors.put("peach", convColor(0.0f, 0.5f, 0.7f, 0.0f));
        Colors.put("melon", convColor(0.0f, 0.46f, 0.5f, 0.0f));
        Colors.put("yelloworange", convColor(0.0f, 0.42f, 1.0f, 0.0f));
        Colors.put("orange", convColor(0.0f, 0.61f, 0.87f, 0.0f));
        Colors.put("burntorange", convColor(0.0f, 0.51f, 1.0f, 0.0f));
        Colors.put("bittersweet", convColor(0.0f, 0.75f, 1.0f, 0.24f));
        Colors.put("redorange", convColor(0.0f, 0.77f, 0.87f, 0.0f));
        Colors.put("mahogany", convColor(0.0f, 0.85f, 0.87f, 0.35f));
        Colors.put("maroon", convColor(0.0f, 0.87f, 0.68f, 0.32f));
        Colors.put("brickred", convColor(0.0f, 0.89f, 0.94f, 0.28f));
        Colors.put("orangered", convColor(0.0f, 1.0f, 0.5f, 0.0f));
        Colors.put("rubinered", convColor(0.0f, 1.0f, 0.13f, 0.0f));
        Colors.put("wildstrawberry", convColor(0.0f, 0.96f, 0.39f, 0.0f));
        Colors.put("salmon", convColor(0.0f, 0.53f, 0.38f, 0.0f));
        Colors.put("carnationpink", convColor(0.0f, 0.63f, 0.0f, 0.0f));
        Colors.put("magenta", convColor(0.0f, 1.0f, 0.0f, 0.0f));
        Colors.put("violetred", convColor(0.0f, 0.81f, 0.0f, 0.0f));
        Colors.put("rhodamine", convColor(0.0f, 0.82f, 0.0f, 0.0f));
        Colors.put("mulberry", convColor(0.34f, 0.9f, 0.0f, 0.02f));
        Colors.put("redviolet", convColor(0.07f, 0.9f, 0.0f, 0.34f));
        Colors.put("fuchsia", convColor(0.47f, 0.91f, 0.0f, 0.08f));
        Colors.put("lavender", convColor(0.0f, 0.48f, 0.0f, 0.0f));
        Colors.put("thistle", convColor(0.12f, 0.59f, 0.0f, 0.0f));
        Colors.put("orchid", convColor(0.32f, 0.64f, 0.0f, 0.0f));
        Colors.put("darkorchid", convColor(0.4f, 0.8f, 0.2f, 0.0f));
        Colors.put("purple", convColor(0.45f, 0.86f, 0.0f, 0.0f));
        Colors.put("plum", convColor(0.5f, 1.0f, 0.0f, 0.0f));
        Colors.put("violet", convColor(0.79f, 0.88f, 0.0f, 0.0f));
        Colors.put("royalpurple", convColor(0.75f, 0.9f, 0.0f, 0.0f));
        Colors.put("blueviolet", convColor(0.86f, 0.91f, 0.0f, 0.04f));
        Colors.put("periwinkle", convColor(0.57f, 0.55f, 0.0f, 0.0f));
        Colors.put("cadetblue", convColor(0.62f, 0.57f, 0.23f, 0.0f));
        Colors.put("cornflowerblue", convColor(0.65f, 0.13f, 0.0f, 0.0f));
        Colors.put("midnightblue", convColor(0.98f, 0.13f, 0.0f, 0.43f));
        Colors.put("navyblue", convColor(0.94f, 0.54f, 0.0f, 0.0f));
        Colors.put("royalblue", convColor(1.0f, 0.5f, 0.0f, 0.0f));
        Colors.put("cerulean", convColor(0.94f, 0.11f, 0.0f, 0.0f));
        Colors.put("processblue", convColor(0.96f, 0.0f, 0.0f, 0.0f));
        Colors.put("skyblue", convColor(0.62f, 0.0f, 0.12f, 0.0f));
        Colors.put("turquoise", convColor(0.85f, 0.0f, 0.2f, 0.0f));
        Colors.put("tealblue", convColor(0.86f, 0.0f, 0.34f, 0.02f));
        Colors.put("aquamarine", convColor(0.82f, 0.0f, 0.3f, 0.0f));
        Colors.put("bluegreen", convColor(0.85f, 0.0f, 0.33f, 0.0f));
        Colors.put("emerald", convColor(1.0f, 0.0f, 0.5f, 0.0f));
        Colors.put("junglegreen", convColor(0.99f, 0.0f, 0.52f, 0.0f));
        Colors.put("seagreen", convColor(0.69f, 0.0f, 0.5f, 0.0f));
        Colors.put("forestgreen", convColor(0.91f, 0.0f, 0.88f, 0.12f));
        Colors.put("pinegreen", convColor(0.92f, 0.0f, 0.59f, 0.25f));
        Colors.put("limegreen", convColor(0.5f, 0.0f, 1.0f, 0.0f));
        Colors.put("yellowgreen", convColor(0.44f, 0.0f, 0.74f, 0.0f));
        Colors.put("springgreen", convColor(0.26f, 0.0f, 0.76f, 0.0f));
        Colors.put("olivegreen", convColor(0.64f, 0.0f, 0.95f, 0.4f));
        Colors.put("rawsienna", convColor(0.0f, 0.72f, 1.0f, 0.45f));
        Colors.put("sepia", convColor(0.0f, 0.83f, 1.0f, 0.7f));
        Colors.put("brown", convColor(0.0f, 0.81f, 1.0f, 0.6f));
        Colors.put("tan", convColor(0.14f, 0.42f, 0.56f, 0.0f));
        Colors.put("gray", convColor(0.0f, 0.0f, 0.0f, 0.5f));
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        teXEnvironment.isColored = true;
        TeXEnvironment copy = teXEnvironment.copy();
        Color color = this.background;
        if (color != null) {
            copy.setBackground(color);
        }
        Color color2 = this.color;
        if (color2 != null) {
            copy.setColor(color2);
        }
        return this.elements.createBox(copy);
    }

    @Override
    public int getLeftType() {
        return this.elements.getLeftType();
    }

    @Override
    public int getRightType() {
        return this.elements.getRightType();
    }

    @Override
    public void setPreviousAtom(Dummy dummy) {
        this.elements.setPreviousAtom(dummy);
    }

    public ColorAtom(Color color, Color color2, ColorAtom colorAtom) {
        this.elements = new RowAtom(colorAtom.elements);
        this.background = color == null ? colorAtom.background : color;
        this.color = color2 == null ? colorAtom.color : color2;
    }
}
